package com.simplecqrs.appengine.messaging;

import com.simplecqrs.appengine.persistence.AggregateHydrationException;
import com.simplecqrs.appengine.persistence.EventCollisionException;

/**
 * Interface to handle particular command
 */
public interface CommandHandler<T extends Command> {
	
	/**
	 * Handle the command
	 * 
	 * @param command
	 * @throws EventCollisionException
	 * @throws AggregateHydrationException
	 */
	void handle(T command) throws EventCollisionException, AggregateHydrationException;
}
