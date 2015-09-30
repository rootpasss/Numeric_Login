//-------------------------------------------------------------------------------------------------------------------------------------------------
package com.java.pass;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.Random;

//-------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Engineered and developed by Jhonny Trejos Barrios.
 * Technology: Java.
 * Version: Java Development Kit 1.8.0_31, Standard Edition.
 * Development Environment: VIM.
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * Additional Info.
 *
 * Source Code Target:
 *
 *			[NUMERIC KEYPAD-LOGIN FOR USERS AUTHENTICATION]
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Password extends JFrame
{
	JPanel contentPane, keyboardPane;
	JLabel label1, label2;
	JTextField userField;
	JPasswordField passField;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
	String keyPass = "";
	int[] series = new int[ 10 ];
	JPanel dataPane;
	//---------------------------------------------------------------------------------------------------------------------------------------------

	public static void main( String[] args )
	{
		new Password().setVisible( true );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------

	public Password()
	{
		setTheme();
		setTitle( "Login" );
		setSize( 165, 248 );
		setLocationRelativeTo( null );
		setResizable( false );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
		contentPane.setLayout( null );
		setContentPane( contentPane );
		
		dataPane = new JPanel();
		dataPane.setBounds( 10, 5, 145, 93 );
		contentPane.add( dataPane );
		dataPane.setLayout( null );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		label1 = new JLabel( "Username" );
		label1.setBounds( 45, 0, 61, 16 );
		dataPane.add( label1 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		label2 = new JLabel( "Password" );
		label2.setBounds( 40, 49, 78, 16 );
		dataPane.add( label2 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		userField = new JTextField();
		userField.setBounds( 0, 16, 145, 28 );
		dataPane.add( userField );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		passField = new JPasswordField();
		passField.setBounds( 0, 65, 145, 28 );
		dataPane.add( passField );
		passField.setToolTipText( "<html> <body> <p style=\"font-size:14pt;color:red;\"> <b><u>Warning</u> </b> </p> <p> Type in your password using <BR> bottom keyboard only. </p> </body> </html>" );
		passField.setFocusable( false );
		userField.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				if( ( ! userField.getText().equals( "" ) && ! String.valueOf( passField.getPassword() ).equals( "" ) ) )
				{
					dispose();
					
					if( String.valueOf( passField.getPassword() ).equals( "0000" ) )
					{
						JOptionPane.showMessageDialog( null, "Welcome.\n\nYour username: " + userField.getText() + "\nPassword: " + String.valueOf( passField.getPassword() ) );
					}
                    else
					{
                        JOptionPane.showMessageDialog( null, "Username / Password missmatch." );
						System.exit( 0 );
                    }
				}
				else
				{
					if( userField.getText().equals( "" ) )
					{
						JOptionPane.showMessageDialog( null, "Your username is required." );
					}
					
					if( String.valueOf( passField.getPassword() ).equals( "" ) )
					{
						JOptionPane.showMessageDialog( null, "Your password is required." );
						showNumbers();
					}
				}
			}
		});
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		keyboardPane = new JPanel();
		keyboardPane.addMouseListener( new MouseAdapter()
		{
			public void mouseEntered( MouseEvent evt )
			{
				showNumbers();
			}
			
			public void mouseExited( MouseEvent evt )
			{
				hideNumbers();
			}
		});
		keyboardPane.setBounds( 10, 105, 145, 115 );
		getContentPane().add( keyboardPane );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button1 = new JButton();
		button1.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 0 ];
				
				passField.setText( keyPass );
			}
		});
		button1.setFocusable( false );
		button1.setBounds( 0, 0, 45, 29 );
		keyboardPane.setLayout( null );
		keyboardPane.add( button1 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button2 = new JButton();
		button2.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 1 ];
				
				passField.setText( keyPass );
			}
		});
		button2.setFocusable( false );
		button2.setBounds( 50, 0, 45, 29 );
		keyboardPane.add( button2 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button3 = new JButton();
		button3.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 2 ];
				
				passField.setText( keyPass );
			}
		});
		button3.setFocusable( false );
		button3.setBounds( 100, 0, 45, 29 );
		keyboardPane.add( button3 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button4 = new JButton();
		button4.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 3 ];
				
				passField.setText( keyPass );
			}
		});
		button4.setFocusable( false );
		button4.setBounds( 100, 28, 45, 29 );
		keyboardPane.add( button4 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button5 = new JButton();
		button5.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 4 ];
				
				passField.setText( keyPass );
			}
		});
		button5.setFocusable( false );
		button5.setBounds( 50, 28, 45, 29 );
		keyboardPane.add( button5 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button6 = new JButton();
		button6.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 5 ];
				
				passField.setText( keyPass );
			}
		});
		button6.setFocusable( false );
		button6.setBounds( 0, 28, 45, 29 );
		keyboardPane.add( button6 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button7 = new JButton();
		button7.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 6 ];
				
				passField.setText( keyPass );
			}
		});
		button7.setFocusable( false );
		button7.setBounds( 0, 56, 45, 29 );
		keyboardPane.add( button7 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button8 = new JButton();
		button8.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 7 ];
				
				passField.setText( keyPass );
			}
		});
		button8.setFocusable( false );
		button8.setBounds( 50, 56, 45, 29 );
		keyboardPane.add( button8 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button9 = new JButton();
		button9.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 8 ];
				
				passField.setText( keyPass );
			}
		});
		button9.setFocusable( false );
		button9.setBounds( 100, 56, 45, 29 );
		keyboardPane.add( button9 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button10 = new JButton();
		button10.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass += series[ 9 ];
				
				passField.setText( keyPass );
			}
		});
		button10.setFocusable( false );
		button10.setBounds( 0, 84, 45, 29 );
		keyboardPane.add( button10 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		button11 = new JButton( "Clear" );
		button11.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent evt )
			{
				keyPass = "";
				
				passField.setText( keyPass );
			}
		});
		button11.setFocusable( false );
		button11.setBounds( 50, 84, 95, 29 );
		keyboardPane.add( button11 );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		generateSeries();
		hideNumbers();
		//-----------------------------------------------------------------------------------------------------------------------------------------
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void setTheme()
	{
		try
		{
			JFrame.setDefaultLookAndFeelDecorated( true );
			JDialog.setDefaultLookAndFeelDecorated( true );
			UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void generateSeries()
	{
		int value;
		series[ 0 ] = new Random().nextInt( 10 );
		
		for( int i = 1; i < series.length; i++ )
		{
			value = new Random().nextInt( 10 );
			
			for( int j = i-1; j >= 0; j-- )
			{
				while( series[ j ] == value )
				{
					value = new Random().nextInt( 10 );
					j = i - 1;
				}
			}
			
			series[ i ] = value;
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void hideNumbers()
	{
		button1.setText( "_" );
		button2.setText( "_" );
		button3.setText( "_" );
		button4.setText( "_" );
		button5.setText( "_" );
		button6.setText( "_" );
		button7.setText( "_" );
		button8.setText( "_" );
		button9.setText( "_" );
		button10.setText( "_" );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void showNumbers()
	{
		button1.setText( series[ 0 ] + "" );
		button2.setText( series[ 1 ] + "" );
		button3.setText( series[ 2 ] + "" );
		button4.setText( series[ 3 ] + "" );
		button5.setText( series[ 4 ] + "" );
		button6.setText( series[ 5 ] + "" );
		button7.setText( series[ 6 ] + "" );
		button8.setText( series[ 7 ] + "" );
		button9.setText( series[ 8 ] + "" );
		button10.setText( series[ 9 ] + "" );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------
