package com.extjs.gxt.samples.desktop.client.ui;

import com.extjs.gxt.ui.client.widget.Composite;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.form.FileUploadField;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.ButtonEvent;

public class Zimu extends Composite {

	public Zimu() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		
		FormPanel frmpnlNewFormpanel = new FormPanel();
		frmpnlNewFormpanel.setHeading("New FormPanel");
		frmpnlNewFormpanel.setCollapsible(true);
		
		TextField txtfldNewTextfield = new TextField();
		frmpnlNewFormpanel.add(txtfldNewTextfield, new FormData("100%"));
		txtfldNewTextfield.setFieldLabel("New TextField");
		
		FileUploadField flpldfldNewFileuploadfield = new FileUploadField();
		frmpnlNewFormpanel.add(flpldfldNewFileuploadfield, new FormData("100%"));
		flpldfldNewFileuploadfield.setFieldLabel("New FileUploadField");
		
		Button btnNewButton = new Button("New Button");
		frmpnlNewFormpanel.add(btnNewButton, new FormData("100%"));
		
		ToolBar toolBar = new ToolBar();
		
		Button btnNewButton_1 = new Button("New Button1");
		toolBar.add(btnNewButton_1);
		
		SeparatorToolItem separatorToolItem = new SeparatorToolItem();
		toolBar.add(separatorToolItem);
		
		Button btnNewButton_2 = new Button("New Button2");
		btnNewButton_2.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
			}
		});
		toolBar.add(btnNewButton_2);
		frmpnlNewFormpanel.setTopComponent(toolBar);
		verticalPanel.add(frmpnlNewFormpanel);
		frmpnlNewFormpanel.setWidth("388px");
		initComponent(verticalPanel);
	}

}
