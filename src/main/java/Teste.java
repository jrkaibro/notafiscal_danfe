import com.fincatto.nfe310.danfe.NFDanfeReport;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Teste {

    public static void main(String[] args) {


        /*String xmlNota = "<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><NFe><infNFe Id=\"NFe33201018171516000164550010000014521002343312\" versao=\"4.00\"><ide><cUF>33</cUF><cNF>00234331</cNF><natOp>VENDA</natOp><mod>55</mod><serie>1</serie><nNF>1452</nNF><dhEmi>2020-10-01T07:39:45-03:00</dhEmi><dhSaiEnt>2020-10-01T07:39:45-03:00</dhSaiEnt><tpNF>1</tpNF><idDest>1</idDest><cMunFG>3302056</cMunFG><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>2</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>4.01</verProc></ide><emit><CNPJ>18171516000164</CNPJ><xNome>E N CLEN SERRALHERIA E VIDRACARIA ITALVENSE LTDA</xNome><xFant>SERRALHERIA E VIDRACARIA ITALVENSE</xFant><enderEmit><xLgr>AV GOV LEONEL DE MOURA BRIZOLA</xLgr><nro>354</nro><xBairro>BOA VISTA</xBairro><cMun>3302056</cMun><xMun>ITALVA</xMun><UF>RJ</UF><CEP>28250000</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>2227831415</fone></enderEmit><IE>79922390</IE><CRT>1</CRT></emit><dest><CPF>08622571742</CPF><xNome>ROSIMAR DE SOUZA SR DIME</xNome><enderDest><xLgr>RUA MIGUEL ANTONIO PESTANA</xLgr><nro>01</nro><xCpl>LOTE 12; QUADRA J  COND VALE DO PARAIBA</xCpl><xBairro>CENTRO</xBairro><cMun>3301009</cMun><xMun>CAMPOS DOS GOYTACAZES</xMun><UF>RJ</UF><CEP>28035100</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderDest><indIEDest>9</indIEDest></dest><det nItem=\"1\"><prod><cProd>BXC21</cProd><cEAN>SEM GTIN</cEAN><xProd>BOX DE CORRER FRONTAL 02 FOLHAS (01 FIXA E 01 MOVEL)INCOLOR 08 MM  TEMPERADO(01218)</xProd><NCM>70071900</NCM><CEST>1003600</CEST><CFOP>5405</CFOP><uCom>UN</uCom><qCom>1.0000</qCom><vUnCom>150.0000000000</vUnCom><vProd>150.00</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UN</uTrib><qTrib>1.0000</qTrib><vUnTrib>150.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>54.72</vTotTrib><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><pST>0.00</pST><vICMSSubstituto>0.00</vICMSSubstituto><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><IPI><CNPJProd>00000000000000</CNPJProd><cSelo>N</cSelo><qSelo>0</qSelo><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>99</CST><vBC>0.00</vBC><pPIS>0.00</pPIS><vPIS>0.00</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>99</CST><vBC>0.00</vBC><pCOFINS>0.00</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"2\"><prod><cProd>F1-150-08MM</cProd><cEAN>SEM GTIN</cEAN><xProd>KIT BOX DE CORRER F11,50 MT  08MM.</xProd><NCM>76042920</NCM><CEST>2806100</CEST><CFOP>5405</CFOP><uCom>UN</uCom><qCom>4.0000</qCom><vUnCom>69.0000000000</vUnCom><vProd>276.00</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UN</uTrib><qTrib>4.0000</qTrib><vUnTrib>69.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>88.57</vTotTrib><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><pST>0.00</pST><vICMSSubstituto>0.00</vICMSSubstituto><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><IPI><CNPJProd>00000000000000</CNPJProd><cSelo>N</cSelo><qSelo>0</qSelo><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>99</CST><vBC>0.00</vBC><pPIS>0.00</pPIS><vPIS>0.00</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>99</CST><vBC>0.00</vBC><pCOFINS>0.00</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSOutr></COFINS></imposto></det><det nItem=\"3\"><prod><cProd>NF-28</cProd><cEAN>SEM GTIN</cEAN><xProd>TRILHO DE FERRO PARA PORTAO DE CORRER.</xProd><NCM>76101000</NCM><CEST>1007100</CEST><CFOP>5405</CFOP><uCom>MT</uCom><qCom>1.0000</qCom><vUnCom>80.0000000000</vUnCom><vProd>80.00</vProd><cEANTrib>SEM GTIN</cEANTrib><uTrib>UN</uTrib><qTrib>1.0000</qTrib><vUnTrib>80.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>25.67</vTotTrib><ICMS><ICMSSN500><orig>0</orig><CSOSN>500</CSOSN><vBCSTRet>0.00</vBCSTRet><pST>0.00</pST><vICMSSubstituto>0.00</vICMSSubstituto><vICMSSTRet>0.00</vICMSSTRet></ICMSSN500></ICMS><IPI><CNPJProd>00000000000000</CNPJProd><cSelo>N</cSelo><qSelo>0</qSelo><cEnq>999</cEnq><IPITrib><CST>99</CST><vBC>0.00</vBC><pIPI>0.00</pIPI><vIPI>0.00</vIPI></IPITrib></IPI><PIS><PISOutr><CST>99</CST><vBC>0.00</vBC><pPIS>0.00</pPIS><vPIS>0.00</vPIS></PISOutr></PIS><COFINS><COFINSOutr><CST>99</CST><vBC>0.00</vBC><pCOFINS>0.00</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSOutr></COFINS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>506.00</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>506.00</vNF><vTotTrib>168.96</vTotTrib></ICMSTot></total><transp><modFrete>0</modFrete><vol><qVol>0</qVol><esp>VOLUMES</esp><pesoL>0.000</pesoL><pesoB>0.000</pesoB></vol></transp><pag><detPag><tPag>90</tPag><vPag>0.00</vPag></detPag></pag><infAdic><infAdFisco>DOC EMITIDO P ME E  EPP OPTANTE P SIMPLES NACIONAL  Permite aproveitamento do credito de ICMS no valor R 1341  correspondente a aliquota de 26500  Nos termos do Art 23 da LC 1232006  VALOR APROX TRIBUTOS R 16896  3339 FONTE IBPT</infAdFisco></infAdic><infRespTec><CNPJ>04329365000115</CNPJ><xContato>Leandro Penha</xContato><email>leandropenha@wvetro.com.br</email><fone>4331724200</fone><idCSRT>99</idCSRT><hashCSRT>YWFhYWFhYWFhYWFhYWFhYWFhYWE=</hashCSRT></infRespTec></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe33201018171516000164550010000014521002343312\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>N0g26AESa2UClZsdDQ9GNiVb35I=</DigestValue></Reference></SignedInfo><SignatureValue>PeacNBFLFB6cZTZzLyHhWUFUTHyajoIs/mndtyJf1ob+zVPc69ebgi/NT4KhmARM5SjPkSjanrHP\n" +
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
                */

        String xmlNota = "<nfeProc versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\">\n" +
                "    <NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\">\n" +
                "        <infNFe Id=\"NFe41200377500049000308550010020747441029387050\" versao=\"4.00\">\n" +
                "            <ide>\n" +
                "                <cUF>41</cUF>\n" +
                "                <cNF>02938705</cNF>\n" +
                "                <natOp>DEVOLUCAO DE COMPRA PARA COMERCIALIZACAO</natOp>\n" +
                "                <mod>55</mod>\n" +
                "                <serie>1</serie>\n" +
                "                <nNF>2074744</nNF>\n" +
                "                <dhEmi>2020-03-16T10:16:50-03:00</dhEmi>\n" +
                "                <dhSaiEnt>2020-03-16T10:16:50-03:00</dhSaiEnt>\n" +
                "                <tpNF>1</tpNF>\n" +
                "                <idDest>1</idDest>\n" +
                "                <cMunFG>4119905</cMunFG>\n" +
                "                <tpImp>1</tpImp>\n" +
                "                <tpEmis>1</tpEmis>\n" +
                "                <cDV>0</cDV>\n" +
                "                <tpAmb>1</tpAmb>\n" +
                "                <finNFe>4</finNFe>\n" +
                "                <indFinal>0</indFinal>\n" +
                "                <indPres>9</indPres>\n" +
                "                <procEmi>0</procEmi>\n" +
                "                <verProc>Sabium Ltda</verProc>\n" +
                "                <NFref>\n" +
                "                    <refNFe>41191106034927000129550010000818051007818058</refNFe>\n" +
                "                </NFref>\n" +
                "            </ide>\n" +
                "            <emit>\n" +
                "                <CNPJ>77500049000308</CNPJ>\n" +
                "                <xNome>MERCADOMOVEIS LTDA TESTE</xNome>\n" +
                "                <xFant>LOJAS MM CDAM TESTE</xFant>\n" +
                "                <enderEmit>\n" +
                "                    <xLgr>RUA VICTOR MEIRELES TESTE</xLgr>\n" +
                "                    <nro>288 TESTE</nro>\n" +
                "                    <xBairro>RONDA TESTE</xBairro>\n" +
                "                    <cMun>4119905 TESTE</cMun>\n" +
                "                    <xMun>PONTA GROSSA TESTE</xMun>\n" +
                "                    <UF>PR</UF>\n" +
                "                    <CEP>84051300</CEP>\n" +
                "                    <cPais>1058</cPais>\n" +
                "                    <xPais>BRASIL</xPais>\n" +
                "                    <fone>4232206000</fone>\n" +
                "                </enderEmit>\n" +
                "                <IE>2010877752</IE>\n" +
                "                <CRT>3</CRT>\n" +
                "            </emit>\n" +
                "            <dest>\n" +
                "                <CNPJ>06034927000129</CNPJ>\n" +
                "                <xNome>BELAFLEX IND E COM DE MOVEIS E ESTOFADOS LTDA</xNome>\n" +
                "                <enderDest>\n" +
                "                    <xLgr>RUA FLORESTA</xLgr>\n" +
                "                    <nro>8</nro>\n" +
                "                    <xBairro>JD SANTA TEREZINHA</xBairro>\n" +
                "                    <cMun>4102802</cMun>\n" +
                "                    <xMun>BELA VISTA DO PARAISO</xMun>\n" +
                "                    <UF>PR</UF>\n" +
                "                    <CEP>86130000</CEP>\n" +
                "                    <cPais>1058</cPais>\n" +
                "                    <xPais>BRASIL</xPais>\n" +
                "                    <fone>4332423506</fone>\n" +
                "                </enderDest>\n" +
                "                <indIEDest>1</indIEDest>\n" +
                "                <IE>9029520124</IE>\n" +
                "            </dest>\n" +
                "            <autXML>\n" +
                "                <CPF>00796624984</CPF>\n" +
                "            </autXML>\n" +
                "            <det nItem=\"1\">\n" +
                "                <prod>\n" +
                "                    <cProd>82233.2037.0</cProd>\n" +
                "                    <cEAN>07909350022515</cEAN>\n" +
                "                    <xProd>PAINEL MOBLER VENICE BF 2001103.656 PRETO FOSCO/NATURE</xProd>\n" +
                "                    <NCM>94036000</NCM>\n" +
                "                    <cBenef>PR830001</cBenef>\n" +
                "                    <CFOP>5202</CFOP>\n" +
                "                    <uCom>UN</uCom>\n" +
                "                    <qCom>2.0000</qCom>\n" +
                "                    <vUnCom>299.0000000</vUnCom>\n" +
                "                    <vProd>598.00</vProd>\n" +
                "                    <cEANTrib>07909350022515</cEANTrib>\n" +
                "                    <uTrib>UN</uTrib>\n" +
                "                    <qTrib>2.0000</qTrib>\n" +
                "                    <vUnTrib>299.0000000</vUnTrib>\n" +
                "                    <indTot>1</indTot>\n" +
                "                </prod>\n" +
                "                <imposto>\n" +
                "                    <ICMS>\n" +
                "                        <ICMS51>\n" +
                "                            <orig>0</orig>\n" +
                "                            <CST>51</CST>\n" +
                "                            <modBC>3</modBC>\n" +
                "                            <vBC>598.00</vBC>\n" +
                "                            <pICMS>18.00</pICMS>\n" +
                "                            <vICMSOp>107.64</vICMSOp>\n" +
                "                            <pDif>33.3300</pDif>\n" +
                "                            <vICMSDif>35.88</vICMSDif>\n" +
                "                            <vICMS>71.76</vICMS>\n" +
                "                        </ICMS51>\n" +
                "                    </ICMS>\n" +
                "                    <IPI>\n" +
                "                        <cEnq>999</cEnq>\n" +
                "                        <IPINT>\n" +
                "                            <CST>53</CST>\n" +
                "                        </IPINT>\n" +
                "                    </IPI>\n" +
                "                    <PIS>\n" +
                "                        <PISAliq>\n" +
                "                            <CST>01</CST>\n" +
                "                            <vBC>556.14</vBC>\n" +
                "                            <pPIS>1.65</pPIS>\n" +
                "                            <vPIS>9.18</vPIS>\n" +
                "                        </PISAliq>\n" +
                "                    </PIS>\n" +
                "                    <COFINS>\n" +
                "                        <COFINSAliq>\n" +
                "                            <CST>01</CST>\n" +
                "                            <vBC>556.14</vBC>\n" +
                "                            <pCOFINS>7.60</pCOFINS>\n" +
                "                            <vCOFINS>42.27</vCOFINS>\n" +
                "                        </COFINSAliq>\n" +
                "                    </COFINS>\n" +
                "                </imposto>\n" +
                "                <impostoDevol>\n" +
                "                    <pDevol>20.00</pDevol>\n" +
                "                    <IPI>\n" +
                "                        <vIPIDevol>29.90</vIPIDevol>\n" +
                "                    </IPI>\n" +
                "                </impostoDevol>\n" +
                "            </det>\n" +
                "            <total>\n" +
                "                <ICMSTot>\n" +
                "                    <vBC>598.00</vBC>\n" +
                "                    <vICMS>71.76</vICMS>\n" +
                "                    <vICMSDeson>0.00</vICMSDeson>\n" +
                "                    <vFCP>0.00</vFCP>\n" +
                "                    <vBCST>0.00</vBCST>\n" +
                "                    <vST>0.00</vST>\n" +
                "                    <vFCPST>0.00</vFCPST>\n" +
                "                    <vFCPSTRet>0.00</vFCPSTRet>\n" +
                "                    <vProd>598.00</vProd>\n" +
                "                    <vFrete>0.00</vFrete>\n" +
                "                    <vSeg>0.00</vSeg>\n" +
                "                    <vDesc>0.00</vDesc>\n" +
                "                    <vII>0.00</vII>\n" +
                "                    <vIPI>0.00</vIPI>\n" +
                "                    <vIPIDevol>29.90</vIPIDevol>\n" +
                "                    <vPIS>9.18</vPIS>\n" +
                "                    <vCOFINS>42.27</vCOFINS>\n" +
                "                    <vOutro>0.00</vOutro>\n" +
                "                    <vNF>627.90</vNF>\n" +
                "                </ICMSTot>\n" +
                "            </total>\n" +
                "            <transp>\n" +
                "                <modFrete>1</modFrete>\n" +
                "                <vol>\n" +
                "                    <qVol>6</qVol>\n" +
                "                    <pesoL>151.800</pesoL>\n" +
                "                    <pesoB>151.800</pesoB>\n" +
                "                </vol>\n" +
                "            </transp>\n" +
                "            <pag>\n" +
                "                <detPag>\n" +
                "                    <tPag>90</tPag>\n" +
                "                    <vPag>0.00</vPag>\n" +
                "                </detPag>\n" +
                "            </pag>\n" +
                "            <infAdic>\n" +
                "                <infAdFisco>OUVIDORIA 0800 420 420</infAdFisco>\n" +
                "                <infCpl>Processo: 5999 / Processo M.: 9978 / DEVOLUCAO REF. FL/N.F.  1/81805 DE 07/11/2019. DEVOLUCAO REFERENTE A PRODUTO DE ASSISTENCIA TECNICA SOLICITADO POR LUIZ BORGES, CQ.    AUTORIZADO POR EVERTON PEREIRA   I.P.I.  29,90 /   Cliente: BELAFLEX /  / Total aproximado de tributos municipais: 0.00./Total aproximado de tributos federais: 0.00./Total aproximado de tributos estaduais: 0.00./Val. Aprox. dos tributos: 0.00 (0.00%) Fonte:IBPT / Filial: 1, Pedido(s): 0</infCpl>\n" +
                "                <obsCont xCampo=\"Observacao\">\n" +
                "                    <xTexto>OUVIDORIA 0800 420 420</xTexto>\n" +
                "                </obsCont>\n" +
                "            </infAdic>\n" +
                "            <infRespTec>\n" +
                "                <CNPJ>07182507000152</CNPJ>\n" +
                "                <xContato>Andre Francisco de Moura</xContato>\n" +
                "                <email>andre@sabium.com.br</email>\n" +
                "                <fone>4433043800</fone>\n" +
                "            </infRespTec>\n" +
                "        </infNFe>\n" +
                "        <Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">\n" +
                "            <SignedInfo>\n" +
                "                <CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\" />\n" +
                "                <SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\" />\n" +
                "                <Reference URI=\"#NFe41200377500049000308550010020747441029387050\">\n" +
                "                    <Transforms>\n" +
                "                        <Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" />\n" +
                "                        <Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\" />\n" +
                "                    </Transforms>\n" +
                "                    <DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\" />\n" +
                "                    <DigestValue>kvNgHzWuHaDy9wsb9hHv1qXBLIQ=</DigestValue>\n" +
                "                </Reference>\n" +
                "            </SignedInfo>\n" +
                "            <SignatureValue>bbpkX+Hsmckr/UFsUNoK7/8lrvdiEKiRjCuqWhFEoL+AZVZlPdvoFiOCvYHb6IrFAsPXBhBLlyKVXUkNXOdvCQEUHY8+EGWMp7msnQhqYtKbNUrKWAOz1jY9xn2p3wPIYe+YFYQeTarEeo3nfGybZd20GxZqGWmZq25PlX3AKGI=</SignatureValue>\n" +
                "            <KeyInfo>\n" +
                "                <X509Data>\n" +
                "                    <X509Certificate>MIICOTCCAaKgAwIBAgIQJpLn3fwH17RNXJHw5VenaDANBgkqhkiG9w0BAQUFADBbMVkwVwYDVQQDHlAAdwB3AHcALgBmAHMAaQBzAHQALgBjAG8AbQAuAGIAcgAgACgAUwBFAE0AIABWAEEATABJAEQAQQBEAEUAIABKAFUAUgDNAEQASQBDAEEAKTAeFw0xNTEyMjQwODI1MjVaFw0xODEyMjQwODI1MjVaMFsxWTBXBgNVBAMeUAB3AHcAdwAuAGYAcwBpAHMAdAAuAGMAbwBtAC4AYgByACAAKABTAEUATQAgAFYAQQBMAEkARABBAEQARQAgAEoAVQBSAM0ARABJAEMAQQApMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDX4BYmJiNwrPz9At2ioXYkMuMWAOf669VPS3SAzIKkJLhSE7Bf9sbTjGHRFZhs6STxKkMBKKnx6dqAEMGlQwDSU42/kqhGya28SUn3HigH2w3dR/536Gt4eAxyLp9ODNXUqWTpnraWCeT41kcnJ27cmOAUMxzxDcsA93n32L4u8wIDAQABMA0GCSqGSIb3DQEBBQUAA4GBAAN89zf+wSFL+4+2Ic8mGva8Z51EzYzNgYEqXwEMHxw4jCxxbsuxewQWedSGWi3SFZla6zmNUEA+UO95tSZ353klTvWDzut2BFSJOPLcMu8HPTTdnMt4ofVeVqKyi2vp+3t78vjqDAAfSAu5C9wT7stoUx41Nok+L6WbmpOIgvHy</X509Certificate>\n" +
                "                </X509Data>\n" +
                "            </KeyInfo>\n" +
                "        </Signature>\n" +
                "    </NFe>\n" +
                "    <protNFe versao=\"4.00\">\n" +
                "        <infProt Id=\"ID141200050755909\">\n" +
                "            <tpAmb>1</tpAmb>\n" +
                "            <verAplic>PR-v4_5_8</verAplic>\n" +
                "            <chNFe>41200377500049000308550010020747441029387050</chNFe>\n" +
                "            <dhRecbto>2020-03-16T10:17:01-03:00</dhRecbto>\n" +
                "            <nProt>141200050755909</nProt>\n" +
                "            <digVal>kvNgHzWuHaDy9wsb9hHv1qXBLIQ=</digVal>\n" +
                "            <cStat>100</cStat>\n" +
                "            <xMotivo>Autorizado o uso da NF-e</xMotivo>\n" +
                "        </infProt>\n" +
                "    </protNFe>\n" +
                "</nfeProc>";


        NFDanfeReport danfe = new NFDanfeReport(xmlNota);
        byte[] logo = null;

        RandomAccessFile f = null;
        try {
            f = new RandomAccessFile("C:\\Users\\marlo\\Documents\\Template_Fundo.png", "r");
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
            JasperExportManager.exportReportToPdfFile(jasper, "danfe.pdf");


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
