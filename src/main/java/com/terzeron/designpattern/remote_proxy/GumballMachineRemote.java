package com.terzeron.designpattern.remote_proxy;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
