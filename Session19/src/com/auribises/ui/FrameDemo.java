package com.auribises.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameDemo implements MouseListener,MouseMotionListener,WindowListener,ActionListener{
	
	JFrame fr;
	
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem m1,m2;
	
	public FrameDemo(){
		fr = new JFrame("Frame Demo");
		fr.setSize(400, 400);
		
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);
		fr.addWindowListener(this);
		
		
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		m1 = new JMenuItem("New");
		m2 = new JMenuItem("Exit");
		
		m2.addActionListener(this);
		
		menu.add(m1);
		menu.add(m2);
		
		menuBar.add(menu);
		
		fr.setJMenuBar(menuBar);
		
		fr.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked: "+e.getX()+":"+e.getY());		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed: "+e.getX()+":"+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased: "+e.getX()+":"+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered: "+e.getX()+":"+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited: "+e.getX()+":"+e.getY());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged: "+e.getX()+":"+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved: "+e.getX()+":"+e.getY());
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		fr.dispose();
		
	}

}
