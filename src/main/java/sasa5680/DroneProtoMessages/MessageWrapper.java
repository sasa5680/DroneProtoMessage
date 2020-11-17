package sasa5680.DroneProtoMessages;
import com.google.protobuf.Any;

public class MessageWrapper {
	
	
	
	public static GeneralOuterClass.General Wrap_Message(com.google.protobuf.Message inner) {
		
		Any any = Any.pack(inner);
		GeneralOuterClass.General msg = GeneralOuterClass.General.newBuilder()
							 									 .addInnerMSG(any)
							 									 .setMessageType(inner.getClass().getSimpleName())
							 									 .build();
		return msg;
	}
	
}
