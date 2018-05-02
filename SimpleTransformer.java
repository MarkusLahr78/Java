import java.io.File;
import javax.xml.transform.Source;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
//import javax.xml.transform.*;
public class SimpleTransformer {
	public static void main(String[] args) {
		SimpleTransformer xslTransformer = new SimpleTransformer();
		xslTransformer.transform();
	}
public void transform() {
	try {
		TransformerFactory tFactory = 
			TransformerFactory.newInstance();
		
		Source stylesheet =
			//new StreamSource(new File("layout.xsl"));
			new StreamSource(new File("layout_pres.xsl"));
		Transformer transformer =
			tFactory.newTransformer(stylesheet);
		
		Source inputDoc =
			//new StreamSource(new File("searchdata.xml"));
		new StreamSource(new File("presidents.xml"));
		Result outputDoc =
			new StreamResult(new File("search_data_pres.html"));
		
		transformer.transform(inputDoc, outputDoc);
	} catch(TransformerException tex) {
		tex.printStackTrace();
		
	}
}
}
