package homeWork_7_1;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IOTest {

	public static void main(String[] args) {

		// URL可以取得網站的內容，利用openStream可以取得InputStream
		URL url = null;
		try {
			url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
//		File file = new File("/Users/vincent/Desktop/a.jpg");
		try (InputStream is = url.openStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);)

		{
			String inputLine;
			StringBuilder sb = new StringBuilder();
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
				System.out.println(inputLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
