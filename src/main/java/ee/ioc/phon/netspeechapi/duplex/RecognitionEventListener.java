package ee.ioc.phon.netspeechapi.duplex;

import org.java_websocket.handshake.ServerHandshake;

public interface RecognitionEventListener {

	void onRecognitionEvent(RecognitionEvent event);
	void onError(Exception exception);
	void onOpen(ServerHandshake serverHandshake);
	void onClose(int code, String reason, boolean remote);
}
