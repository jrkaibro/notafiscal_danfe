package com.fincatto.nfe310.danfe;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class DanfeApi {
    public String gerarPDFxml(String xml, String urlLogo, String directoryToSave, String fileName) {
        String returnValue;
        String directory = directoryValidate(directoryToSave, fileName);
        try {
            File verifyDirectory = new File(directory);
            if (verifyDirectory.exists()) {
                NFDanfeReport danfe = new NFDanfeReport(xml);
                JasperPrint jasper;
                RandomAccessFile f;
                File verifyImage = new File(urlLogo);
                byte[] logo = null;

                if (verifyImage.exists()) {
                    f = new RandomAccessFile(urlLogo, "r");
                    logo = new byte[(int) f.length()];
                    f.read(logo);
                    f.close();
                } else {
                    System.out.println("Logo não encontrada");
                }
                try {
                    jasper = danfe.createJasperPrintNFe(logo);
                    JasperExportManager.exportReportToPdfFile(jasper, directory);
                    returnValue = directory;
                } catch (IOException | ParserConfigurationException | SAXException | JRException e) {
                    returnValue = "Error: " + e.getMessage() + "cause: " + e.getCause();
                }
            } else {
                returnValue = "Diretório inexistente";
            }
        } catch (Exception e) {
            returnValue = "Diretório inexistente 1";
        }
        return returnValue;
    }

    private String directoryValidate(String directoryToSave, String fileName) {
        String directory;
        File verifyDirectory = new File(directoryToSave);
        if (verifyDirectory.exists()) {
            fileName = fileName.replaceAll(".pdf", "");
            try {
                if (directoryToSave.charAt(directoryToSave.length() - 1) == '\\') {
                    directory = directoryToSave + fileName + ".pdf";
                } else {
                    directory = directoryToSave + "\\" + fileName + ".pdf";
                }
            } catch (Exception e) {
                directory = null;
            }
        } else {
            directory = null;
        }
        return directory;
    }
}

