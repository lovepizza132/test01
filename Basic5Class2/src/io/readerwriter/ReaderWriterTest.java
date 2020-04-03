package io.readerwriter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderWriterTest
{
	public static void main( String args[])
	{
		UIForm3 ui = new UIForm3();
		ui.addLayout();
		ui.eventProc();	
	}	
}

//========================================
//	화면을 관리하는 클래스 
//----------------------------------------
class UIForm3 extends JFrame
{
	JTextArea	ta;
	JButton 		bSave, bLoad, bClear;
	
	UIForm3()
	{
		ta		= new JTextArea();		
		bSave 	= new JButton("파일저장");
		bLoad	= new JButton("파일읽기");
		bClear	= new JButton("화면지우기");
	}
	
	void addLayout()
	{
		JPanel pCenter 	= new JPanel();
		pCenter.setLayout( new BorderLayout() );
		pCenter.add("Center", new JScrollPane(ta) );
	
		JPanel pSouth	= new JPanel();
		pSouth.add( bSave );
		pSouth.add( bLoad );
		pSouth.add( bClear );
		
		getContentPane().add("Center", pCenter );
		getContentPane().add("South",  pSouth );
		
		setSize( 400, 350 );
		setVisible( true );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	void eventProc()
	{
		EventHandler hdlr = new EventHandler();
		
		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);
		bClear.addActionListener(hdlr);
		
	}
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object evt = ev.getSource();
			
			// "화일저장" 버튼이 눌렸을 때 
			if( evt == bSave){
				JFileChooser fd = new JFileChooser();
				int returnValue = fd.showSaveDialog( null );//Dialog는 독립적이지 않고 부분적인 window이기 때문에
				if( returnValue == JFileChooser.APPROVE_OPTION )
				{
					File f = fd.getSelectedFile();
					try{
						/** 
						 * @@@@@@@@@@@@@@@@@@@@@@@@@
						 * */
					String msg = ta.getText();	
						
					FileWriter fw = new FileWriter(f);
					fw.write(msg);
					fw.close();
						
					}catch(Exception ex){
						System.out.println("저장 실패");
					}	
				}
			}
			
			// "화일읽기" 버튼이 눌렸을 때 
			else if(evt == bLoad) {
				JFileChooser fd = new JFileChooser();//파일을 선택할 수 있게 파일dialog 생성
				int returnValue = fd.showOpenDialog( null );//Dialog는 독립적이지 않고 부분적인 window이기 때문에 - 무엇을 골랐는지 저장함
				if( returnValue == JFileChooser.APPROVE_OPTION ) {//무엇을 골랐는지 저장함
					File f = fd.getSelectedFile();

					try {
						FileReader fr = new FileReader(f);
						char[] data = new char[1024*3];
						fr.read(data);//저장할 만한 공간을 제공해준다면 사용 가능

						ta.setText(String.valueOf(data));//받아온 데이터를 ta에 찍겠다.

						fr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}					
			}	
			else if(evt == bClear) {
				ta.setText(null);

			}
		}
	}
}