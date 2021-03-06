/* 
 PureMVC Java MultiCore Pipes Utility Port by Ima OpenSource <opensource@ima.eu>
 Maintained by Anthony Quinault <anthony.quinault@puremvc.org>
 PureMVC - Copyright(c) 2006-08 Futurescale, Inc., Some rights reserved. 
 Your reuse is governed by the Creative Commons Attribution 3.0 License 
 */
package org.puremvc.java.multicore.utilities.pipes.interfaces;

/** 
 * Pipe Message Interface.
 * <P>
 * <code>IPipeMessage</code>s are objects written intoto a Pipeline, 
 * composed of <code>IPipeFitting</code>s. The message is passed from 
 * one fitting to the next in syncrhonous fashion.</P> 
 * <P>
 * Depending on type, messages may be handled  differently by the 
 * fittings.</P>
 */
public interface IPipeMessage {
	// Get the type of this message
	String getType();

	// Set the type of this message
	void setType(String type);
	
	// Get the priority of this message
	int getPriority();

	// Set the priority of this message
	void setPriority(int priority);
	
	// Get the header of this message
	Object getHeader();

	// Set the header of this message
	void setHeader(Object header);
	
	// Get the body of this message
	Object getBody();

	// Set the body of this message
	void setBody(Object body);
}
