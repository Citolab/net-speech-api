package ee.ioc.phon.netspeechapi.duplex;

import java.io.IOException;

public interface DuplexRecognitionSession {

	void connect();
	
	void sendChunk(byte[] bytes, boolean isLast) throws IOException;
	
	void addRecognitionEventListener(RecognitionEventListener recognitionEventListener);
}
