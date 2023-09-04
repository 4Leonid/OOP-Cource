package Homework.HW5.view;

import Homework.HW5.model.User;

import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}