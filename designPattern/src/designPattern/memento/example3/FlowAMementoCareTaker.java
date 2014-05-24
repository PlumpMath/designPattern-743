package designPattern.memento.example3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FlowAMementoCareTaker {

	public void saveMemento(FlowAMockMemento memento) {
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream("FlowAMemento")));
			out.writeObject(memento);
		} catch (Exception err) {
			err.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public FlowAMockMemento retriveMemento() {
		FlowAMockMemento memento = null;

		ObjectInputStream in = null;

		try {
			in = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream("FlowAMemento")));
			memento = (FlowAMockMemento) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return memento;
	}
}
