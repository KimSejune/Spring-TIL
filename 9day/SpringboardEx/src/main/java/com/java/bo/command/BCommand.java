package com.java.bo.command;

import org.springframework.ui.Model;

public interface BCommand {
	public void execute(Model model) throws Exception;
}
