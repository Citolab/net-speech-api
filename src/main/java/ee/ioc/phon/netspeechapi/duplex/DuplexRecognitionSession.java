package ee.ioc.phon.netspeechapi.duplex;

import java.io.IOException;

public interface DuplexRecognitionSession {

	void connect();
	
	void sendChunk(byte[] bytes, boolean isLast);
	
	void addRecognitionEventListener(RecognitionEventListener recognitionEventListener);
}
