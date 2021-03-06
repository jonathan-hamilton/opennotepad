package opennotepad;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenNotePad {
	
	@RequestMapping("/open")
	public void open() {
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("notepad");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
