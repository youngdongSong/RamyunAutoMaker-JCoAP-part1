package org.ws4d.coap.messages;

import org.ws4d.coap.interfaces.CoapRequest;
import org.ws4d.coap.interfaces.CoapServerChannel;

public interface handler
{	
	public void onRequest2(CoapServerChannel channel, CoapRequest request);
}
