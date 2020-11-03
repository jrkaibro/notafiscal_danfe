package com.fincatto.nfe310.danfe;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Teste {

    public static void main(String[] args) {


        String xmlNota = "<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe><infNFe Id=\"NFe33201018171516000164550010000014521002343312\" versao=\"4.00\"><ide><cUF>33</cUF><cNF>00234331</cNF><natOp>VENDA</natOp><mod>55</mod><serie>1</serie><nNF>1452</nNF><dhEmi>2020-10-01T07:39:45-03:00</dhEmi><dhSaiEnt>2020-10-01T07:39:45-03:00</dhSaiEnt><tpNF>1</tpNF><idDest>1</idDest><cMunFG>3302056</cMunFG><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>2</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>4.01</verProc></ide><emit><CNPJ>18171516000164</CNPJ><xNome>E N CLEN SERRALHERIA E VIDRACARIA ITALVENSE LTDA</xNome><xFant>SERRALHERIA E VIDRACARIA ITALVENSE</xFant><enderEmit><xLgr>AV GOV LEONEL DE MOURA BRIZOLA</xLgr><nro>354</nro><xBairro>BOA VISTA</xBairro><cMun>3302056</cMun><xMun>ITALVA</xMun><UF>RJ</UF><CEP>28250000</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>2227831415</fone></enderEmit><IE>79922390</IE><CRT>1</CRT></emit><dest><CPF>08622571742</CPF><xNome>ROSIMAR DE SOUZA SR DIME</xNome><enderDest><xLgr>RUA MIGUEL ANTONIO PESTANA</xLgr><nro>01</nro><xCpl>LOTE 12; QUADRA J  COND VALE DO PARAIBA</xCpl><xBairro>CENTRO</xBairro><cMun>3301009</cMun><xMun>CAMPOS DOS GOYTACAZES</xMun><UF>RJ</UF><CEP>28035100</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderDest><indIEDest>9</indIEDest></dest><det nItem=\"1\"><prod><cProd>BXC21</cProd><cEAN>SEM GTIN</cEAN><xProd>BOX DE CORRER FRONTAL 02 FOLHAS (01 FIXA E 01 MOVEL)INCOLOR 08 MM  TEMPERADO(01218)</xProd><NCM>70071900</NCM><CEST>1003600</CEST><CFOP>5405</CFOP><uCom>UN</uCom><qCom>1.0000</qCom><vUnCom>150.0000000000</vUnCom><vProd>150.00</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UN</uTrib><qTrib>1.0000</qTrib><vUnTrib>150.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>54.72</vTotTrib><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><pST>0.00</pST><vICMSSubstituto>0.00</vICMSSubstituto><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><IPI><CNPJProd>00000000000000</CNPJProd><cSelo>N</cSelo><qSelo>0</qSelo><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>99</CST><vBC>0.00</vBC><pPIS>0.00</pPIS><vPIS>0.00</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>99</CST><vBC>0.00</vBC><pCOFINS>0.00</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"2\"><prod><cProd>F1-150-08MM</cProd><cEAN>SEM GTIN</cEAN><xProd>KIT BOX DE CORRER F11,50 MT  08MM.</xProd><NCM>76042920</NCM><CEST>2806100</CEST><CFOP>5405</CFOP><uCom>UN</uCom><qCom>4.0000</qCom><vUnCom>69.0000000000</vUnCom><vProd>276.00</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UN</uTrib><qTrib>4.0000</qTrib><vUnTrib>69.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>88.57</vTotTrib><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><pST>0.00</pST><vICMSSubstituto>0.00</vICMSSubstituto><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><IPI><CNPJProd>00000000000000</CNPJProd><cSelo>N</cSelo><qSelo>0</qSelo><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>99</CST><vBC>0.00</vBC><pPIS>0.00</pPIS><vPIS>0.00</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>99</CST><vBC>0.00</vBC><pCOFINS>0.00</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"3\"><prod><cProd>NF-28</cProd><cEAN>SEM GTIN</cEAN><xProd>TRILHO DE FERRO PARA PORTAO DE CORRER.</xProd><NCM>76101000</NCM><CEST>1007100</CEST><CFOP>5405</CFOP><uCom>MT</uCom><qCom>1.0000</qCom><vUnCom>80.0000000000</vUnCom><vProd>80.00</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UN</uTrib><qTrib>1.0000</qTrib><vUnTrib>80.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>25.67</vTotTrib><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><pST>0.00</pST><vICMSSubstituto>0.00</vICMSSubstituto><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><IPI><CNPJProd>00000000000000</CNPJProd><cSelo>N</cSelo><qSelo>0</qSelo><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>99</CST><vBC>0.00</vBC><pPIS>0.00</pPIS><vPIS>0.00</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>99</CST><vBC>0.00</vBC><pCOFINS>0.00</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSOutr></COFINS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>506.00</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>506.00</vNF><vTotTrib>168.96</vTotTrib></ICMSTot></total><transp><modFrete>0</modFrete><vol><qVol>0</qVol><esp>VOLUMES</esp><pesoL>0.000</pesoL><pesoB>0.000</pesoB></vol></transp><pag><detPag><tPag>90</tPag><vPag>0.00</vPag></detPag></pag><infAdic><infAdFisco>DOC EMITIDO P ME E  EPP OPTANTE P SIMPLES NACIONAL  Permite aproveitamento do credito de ICMS no valor R 1341  correspondente a aliquota de 26500  Nos termos do Art 23 da LC 1232006  VALOR APROX TRIBUTOS R 16896  3339 FONTE IBPT</infAdFisco></infAdic><infRespTec><CNPJ>04329365000115</CNPJ><xContato>Leandro Penha</xContato><email>leandropenha@wvetro.com.br</email><fone>4331724200</fone><idCSRT>99</idCSRT><hashCSRT>YWFhYWFhYWFhYWFhYWFhYWFhYWE=</hashCSRT></infRespTec></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe33201018171516000164550010000014521002343312\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>N0g26AESa2UClZsdDQ9GNiVb35I=</DigestValue></Reference></SignedInfo><SignatureValue>PeacNBFLFB6cZTZzLyHhWUFUTHyajoIs/mndtyJf1ob+zVPc69ebgi/NT4KhmARM5SjPkSjanrHP\n" +
                "tfyu6lRqumpWz/WapoG09DFifTBPe3gAEZBfdL96WTJmlvVcast6Ph6sS+ZR+B42nsOc9U5PJLXK\n" +
                "38g67ULWdpUMf6B6IyyVq7upElKSpzyzLtENPzjqazynbAzXV6aqI6sb/wn4j0TxiHCZkPbvTiCK\n" +
                "BxqYcCwdedc1mc1MdIlho5JHS4qIu6Q8oscUVC2I3gDEdWfW7aB3qgk7c11OYyaDvPYD56qyejqB\n" +
                "ihS39PJME4KuMCUxjeQaQ9/oHSirk5E4Z83HWw==</SignatureValue><KeyInfo><X509Data><X509Certificate>MIIH8TCCBdmgAwIBAgIIbAb1741LwtowDQYJKoZIhvcNAQELBQAwdDELMAkGA1UEBhMCQlIxEzAR\n" +
                "BgNVBAoTCklDUC1CcmFzaWwxNjA0BgNVBAsTLVNlY3JldGFyaWEgZGEgUmVjZWl0YSBGZWRlcmFs\n" +
                "IGRvIEJyYXNpbCAtIFJGQjEYMBYGA1UEAxMPQUMgVkFMSUQgUkZCIHY1MB4XDTIwMDQwMzExNDYw\n" +
                "MFoXDTIxMDQwMzExNDYwMFowggESMQswCQYDVQQGEwJCUjELMAkGA1UECBMCUkoxDzANBgNVBAcT\n" +
                "BklUQUxWQTETMBEGA1UEChMKSUNQLUJyYXNpbDE2MDQGA1UECxMtU2VjcmV0YXJpYSBkYSBSZWNl\n" +
                "aXRhIEZlZGVyYWwgZG8gQnJhc2lsIC0gUkZCMRYwFAYDVQQLEw1SRkIgZS1DTlBKIEExMR0wGwYD\n" +
                "VQQLExRBUiBTSUcgQ0VSVElGSUNBRE9SQTEXMBUGA1UECxMOMjIwNjUzMzIwMDAxOTcxSDBGBgNV\n" +
                "BAMTP0UgTiBDTEVOIFNFUlJBTEhFUklBIEUgVklEUkFDQVJJQSBJVEFMVkVOU0UgTFREQToxODE3\n" +
                "MTUxNjAwMDE2NDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANXFzXKDP6rGuU3bqwTg\n" +
                "D5YmScIoNUmJYcL/Rua/aggacJL7YJ9Pgjp13HH3gAMn8rxmzJvscXE1eFKcLPptzWs3NPpfS4E0\n" +
                "TcMb988sICT0xHmcSX7sJ0w3JMzkjWIdyDP8z5cWfDyyAIZRLWRvh1DdS82XREol+smUPEYA+Jn3\n" +
                "7Kh7hJN2fj21oa3qu4KXq7Jhv1r0fgUT0+a50QjzWm9RtRvS0xV+gUSaBcCXmVOydOxL8S9rzqQs\n" +
                "SsxAKrpUo5jxfiKd/tuE5KWVphugo7i4IvYpSGf8JCXFsJvv+oCdd3XoYZqqHmhN5Ny6WtmQQqGb\n" +
                "aEmPfNEc+Q0NQXjnLFcCAwEAAaOCAuUwggLhMIGcBggrBgEFBQcBAQSBjzCBjDBVBggrBgEFBQcw\n" +
                "AoZJaHR0cDovL2ljcC1icmFzaWwudmFsaWRjZXJ0aWZpY2Fkb3JhLmNvbS5ici9hYy12YWxpZHJm\n" +
                "Yi9hYy12YWxpZHJmYnY1LnA3YjAzBggrBgEFBQcwAYYnaHR0cDovL29jc3B2NS52YWxpZGNlcnRp\n" +
                "ZmljYWRvcmEuY29tLmJyMAkGA1UdEwQCMAAwHwYDVR0jBBgwFoAUU8ul5HVQmUAsvlsVRcm+yzCq\n" +
                "icUwcAYDVR0gBGkwZzBlBgZgTAECASUwWzBZBggrBgEFBQcCARZNaHR0cDovL2ljcC1icmFzaWwu\n" +
                "dmFsaWRjZXJ0aWZpY2Fkb3JhLmNvbS5ici9hYy12YWxpZHJmYi9kcGMtYWMtdmFsaWRyZmJ2NS5w\n" +
                "ZGYwgbYGA1UdHwSBrjCBqzBToFGgT4ZNaHR0cDovL2ljcC1icmFzaWwudmFsaWRjZXJ0aWZpY2Fk\n" +
                "b3JhLmNvbS5ici9hYy12YWxpZHJmYi9sY3ItYWMtdmFsaWRyZmJ2NS5jcmwwVKBSoFCGTmh0dHA6\n" +
                "Ly9pY3AtYnJhc2lsMi52YWxpZGNlcnRpZmljYWRvcmEuY29tLmJyL2FjLXZhbGlkcmZiL2xjci1h\n" +
                "Yy12YWxpZHJmYnY1LmNybDAOBgNVHQ8BAf8EBAMCBeAwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsG\n" +
                "AQUFBwMEMIG5BgNVHREEgbEwga6BHmZpbmFuY2Vpcm9pdGFsdmVuc2VAYm9sLmNvbS5icqA4BgVg\n" +
                "TAEDBKAvBC0xNDA1MTk4MjEwMzg4MDcyNzE3MDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDCgHgYF\n" +
                "YEwBAwKgFQQTRUxJQVMgQ0xFTiBGRVJSRUlSQaAZBgVgTAEDA6AQBA4xODE3MTUxNjAwMDE2NKAX\n" +
                "BgVgTAEDB6AOBAwwMDAwMDAwMDAwMDAwDQYJKoZIhvcNAQELBQADggIBAMgdW8IhHNvcPsKJk0Gs\n" +
                "oz8GXYqjAQrJuOktLgeZ2YqXjqk43a8iRsbdTlJkSat2u8pQ8N9P7hXudafdIopP9oiDJDUqw43c\n" +
                "QmCxlh7BK3hoi1/ShYFsnYf67jHNIOafA+ywvpio4y+Cc2YU5sGfNkOf42GelRMmvjvrw6Pgp2Qm\n" +
                "S7AdmOtD1kzJ+bufBMQUfzzLxppnBGZzhjYpAkb8avuvpIDBCHFjFQjx7DVDWEFLjnHIbYdk/hLT\n" +
                "0rsw8Tmz/RckBzwlYgL/eA9MHtxxQpB96cnLTKR/4eR68GTm6s0Mr7Nw6C0ank4BPpb3y1WUgdjN\n" +
                "nfX3d/afhsfPUzKtMo7yQsqF76jDu26rjtqxOsZd3O2aD2CKvwtp7FrmS+deBhhiHbokzwOgU6Hf\n" +
                "connTGAht6tWfxSAd8fLsaQxa3V0DFRPf/S85z5tTXscW2HPixo4UVfnTeEzOkg2QeDDwwdRg1rv\n" +
                "BMPJ/hh8lmI6KODa/zvcmmp+Ma0v9ZPZPN/Dy+RcWUEz0s3nlNxw+LTF3iWUBh7ZPRxXFq5MQx6C\n" +
                "ypsUK+Age7Bnf50Cy/0vPiEjMqpBWr3lj3eeJbflWrzl7Gn+3mrzTLVw2vKF9SadQ5wG7pc8gexg\n" +
                "K2APe3Q45rI9HsP0V5KHIR8MkoXY98sSXmLRo3BN66MtFlc1GesJAagp</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe versao=\"4.00\"><infProt Id=\"ID333200140419028\"><tpAmb>1</tpAmb><verAplic>SVRS201908091113</verAplic><chNFe>33201018171516000164550010000014521002343312</chNFe><dhRecbto>2020-10-01T07:39:49-03:00</dhRecbto><nProt>333200140419028</nProt><digVal>N0g26AESa2UClZsdDQ9GNiVb35I=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";


        NFDanfeReport danfe = new NFDanfeReport(xmlNota);
        byte[] logo = null;

        RandomAccessFile f = null;
        try {
            f = new RandomAccessFile("1218.png", "r");
            logo = new byte[(int) f.length()];
            f.read(logo);
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        JasperPrint jasper = null;
        try {



            jasper = danfe.createJasperPrintNFe(logo);
            //byte[] byteArray = JasperExportManager.exportReportToPdf(jasper);
           JasperExportManager.exportReportToPdfFile(jasper , "danfe.pdf");


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }



        // do something here...
    }
}
