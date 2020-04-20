import java.awt.*;


import java.awt.event.*;


import javax.swing.*;


import javax.swing.border.*;


import java.io.*;

import java.util.*;

public class resume
{


  public static void main (String[]args)
  {



    abhi obj = new abhi ();



  }
}
class abhi extends JFrame implements ActionListener
{


  JPanel p1, p2, p3, panel1, panel2, panel3, panel4, panel5, panel6,
    mainpanel, r1, r2, r3, r4, d1, d2;


  Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15,
    l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29,
    l30, l31, l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42, l43;


  TextField t1, t2, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15,
    t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29,
    t30, t31, t32, t33, t34, t35;


  JRadioButton br1, br2;


  Button b1, b2, b3, b4;


  TextArea ta1, ta2, ta3, ta4, ta5;


  FileWriter f1;


  ButtonGroup btn;


    JComboBox < String > dropdown1;


    JComboBox < String > dropdown2;


    JComboBox < String > dropdown3;




  public abhi()
  {

    panel1 = new JPanel ();


    panel2 = new JPanel ();


    panel3 = new JPanel ();


    panel4 = new JPanel ();


    panel5 = new JPanel ();


    panel6 = new JPanel ();


    mainpanel = new JPanel ();


    mainpanel.setLayout (new GridLayout (2,3, 10, 10));


    panel1.setLayout (new GridLayout (3, 1));


    panel2.setLayout (new GridLayout (11, 2, 0, 5));


    panel3.setLayout (new GridLayout (9, 2, 0, 10));


    panel4.setLayout (new GridLayout (4, 1));


    panel5.setLayout (new GridLayout (7, 1));


    panel6.setLayout (new GridLayout (2, 1, 0, 10));


    mainpanel.setBackground (Color.black);

    panel1.setBackground (new Color (173, 216, 230));

    panel2.setBackground (new Color (173, 216, 230));

    panel3.setBackground (new Color (173, 216, 230));

    panel4.setBackground (new Color (173, 216, 230));

    panel5.setBackground (new Color (173, 216, 230));

    panel6.setBackground (new Color (173, 216, 230));


    p1 = new JPanel (new GridLayout (2, 2, 0, 18));


    p2 = new JPanel (new GridLayout (1, 3, 2, 2));


    p3 = new JPanel (new GridLayout (3, 2, 0, 10));

    r1 = new JPanel (new GridLayout (1, 1));

    r3 = new JPanel (new GridLayout (1, 1));


    r2 = new JPanel (new GridLayout (3, 2, 0, 2));


    r4 = new JPanel (new GridLayout (3, 2, 0, 2));

    d1 = new JPanel (new GridLayout (2, 2, 18, 18));


    d2 = new JPanel (new GridLayout (1, 2));

    p1.setBackground (new Color (173, 216, 230));

    p2.setBackground (new Color (173, 216, 230));

    p3.setBackground (new Color (173, 216, 230));

    r1.setBackground (new Color (173, 216, 230));

    r2.setBackground (new Color (173, 216, 230));


    r3.setBackground (new Color (173, 216, 230));

    r4.setBackground (new Color (173, 216, 230));

    d1.setBackground (new Color (173, 216, 230));

    d2.setBackground (new Color (173, 216, 230));


    setVisible (true);


    setSize (800, 800);


    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


    setTitle ("build your resume");


    l1 = new Label ("first name");


    t1 = new TextField ("");


    l1.setFont (new Font ("Serif", Font.PLAIN, 18));

    p1.add (l1);


    p1.add (t1);



    l2 = new Label ("last name");

    t2 = new TextField ("");


    l2.setFont (new Font ("Serif", Font.PLAIN, 18));



    p1.add (l2);


    p1.add (t2);



    l3 = new Label ("gender");


    l3.setFont (new Font ("Serif", Font.PLAIN, 18));


    p2.add (l3);



    br1 = new JRadioButton ("male");


    br2 = new JRadioButton ("female");


    btn = new ButtonGroup ();


    btn.add (br1);


    btn.add (br2);

    br1.setBackground (new Color (173, 216, 230));

    br2.setBackground (new Color (173, 216, 230));


    br1.setFont (new Font ("Serif", Font.PLAIN, 18));

    br2.setFont (new Font ("Serif", Font.PLAIN, 18));


    p2.add (br1);


    p2.add (br2);


    l4 = new Label ("email-id");


    t4 = new TextField ("eg: abhi@gmail.com");


    l4.setFont (new Font ("Serif", Font.PLAIN, 18));


    p3.add (l4);


    p3.add (t4);



    l5 = new Label ("phone number");


    t5 = new TextField (15);


    l5.setFont (new Font ("Serif", Font.PLAIN, 18));

    p3.add (l5);


    p3.add (t5);


    l6 = new Label ("address");


    t6 = new TextField (15);


    l6.setFont (new Font ("Serif", Font.PLAIN, 18));

    p3.add (l6);


    p3.add (t6);


    l7 = new Label ("College name");



    l7.setFont (new Font ("Serif", Font.PLAIN, 18));

    t7 = new TextField (15);


    l9 = new Label ("Percentage/cgpa:");


    t9 = new TextField (5);



    l9.setFont (new Font ("Serif", Font.PLAIN, 18));



    l11 = new Label ("Graduation year");


    l11.setFont (new Font ("Serif", Font.PLAIN, 18));

    String[]years = new String[]
    {

    "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
	"2019", "2018", "2021", "2022", "2023"};


    dropdown1 = new JComboBox < String > (years);


    dropdown2 = new JComboBox < String > (years);


    dropdown3 = new JComboBox < String > (years);


    l12 = new Label ("School name(xth):");


    l12.setFont (new Font ("Serif", Font.PLAIN, 18));

    t12 = new TextField (5);



    l13 = new Label ("percentage/cgpa:");


    l13.setFont (new Font ("Serif", Font.PLAIN, 18));

    t13 = new TextField (5);



    l14 = new Label ("year:");


    l14.setFont (new Font ("Serif", Font.PLAIN, 18));


    l15 = new Label ("School name(xiith):");


    l15.setFont (new Font ("Serif", Font.PLAIN, 18));

    t15 = new TextField (5);



    l16 = new Label ("percentage/cgpa:");


    l16.setFont (new Font ("Serif", Font.PLAIN, 18));

    t16 = new TextField (5);



    l17 = new Label ("year:");



    l17.setFont (new Font ("Serif", Font.PLAIN, 18));


    panel2.add (l7);


    panel2.add (t7);



    panel2.add (l9);


    panel2.add (t9);




    panel2.add (l11);


    panel2.add (dropdown1);

    panel2.add (new JSeparator ());

    panel2.add (new JSeparator ());


    panel2.add (l12);


    panel2.add (t12);


    panel2.add (l13);


    panel2.add (t13);


    panel2.add (l14);


    panel2.add (dropdown2);

    panel2.add (new JSeparator ());

    panel2.add (new JSeparator ());


    panel2.add (l15);


    panel2.add (t15);


    panel2.add (l16);


    panel2.add (t16);


    panel2.add (l17);


    panel2.add (dropdown3);



    panel1.add (p1);


    panel1.add (p2);


    panel1.add (p3);




    l18 = new Label ("project name:");


    l18.setFont (new Font ("Serif", Font.PLAIN, 18));

    t18 = new TextField ("enter project name");


    l19 = new Label ("project starting date");


    l19.setFont (new Font ("Serif", Font.PLAIN, 18));

    t19 = new TextField ("dd-mm-yyyy");


    l20 = new Label ("project ending date");


    l20.setFont (new Font ("Serif", Font.PLAIN, 18));

    t20 = new TextField ("dd-mm-yyyy");


    l21 = new Label ("project description: ");


    l21.setFont (new Font ("Serif", Font.PLAIN, 18));

    ta1 = new TextArea ("enter your project description here");


    l22 = new Label ("project name:");

    l22.setFont (new Font ("Serif", Font.PLAIN, 18));

    t22 = new TextField ("enter project name");


    l23 = new Label ("project starting date");

    l23.setFont (new Font ("Serif", Font.PLAIN, 18));

    t23 = new TextField ("dd-mm-yyyy");


    l24 = new Label ("project ending date");

    l24.setFont (new Font ("Serif", Font.PLAIN, 18));

    t24 = new TextField ("dd-mm-yyyy");


    l25 = new Label ("project description:");

    l25.setFont (new Font ("Serif", Font.PLAIN, 18));

    ta2 = new TextArea ("enter your project description here");


    ta1.setBounds (10, 30, 500, 500);


    ta2.setBounds (10, 30, 500, 500);


    panel3.add (l18);


    panel3.add (t18);


    panel3.add (l19);


    panel3.add (t19);


    panel3.add (l20);


    panel3.add (t20);


    panel3.add (l21);


    panel3.add (ta1);

    panel3.add (new JSeparator ());

    panel3.add (new JSeparator ());

    panel3.add (l22);


    panel3.add (t22);


    panel3.add (l23);


    panel3.add (t23);


    panel3.add (l24);


    panel3.add (t24);


    panel3.add (l25);


    panel3.add (ta2);



    l26 = new Label ("your skills", SwingConstants.CENTER);


    l27 = new Label ("skill-1: ");

    l27.setFont (new Font ("Serif", Font.PLAIN, 16));

    t27 = new TextField (5);


    l28 = new Label ("skill-2: ");

    l28.setFont (new Font ("Serif", Font.PLAIN, 16));

    t28 = new TextField (5);


    l29 = new Label ("skill-3:");

    l29.setFont (new Font ("Serif", Font.PLAIN, 16));

    t29 = new TextField (5);




    l31 = new Label ("your hobbies", SwingConstants.CENTER);


    l32 = new Label ("hobby-1: ");

    l32.setFont (new Font ("Serif", Font.PLAIN, 16));

    t32 = new TextField (5);


    l33 = new Label ("hobby-2:");

    l33.setFont (new Font ("Serif", Font.PLAIN, 16));

    t33 = new TextField (5);


    l34 = new Label ("hobby-3: ");

    l34.setFont (new Font ("Serif", Font.PLAIN, 16));

    t34 = new TextField (5);




    l31.setFont (new Font ("Serif", Font.PLAIN, 24));



    l26.setFont (new Font ("Serif", Font.PLAIN, 24));


    r2.add (l27);


    r2.add (t27);


    r2.add (l28);


    r2.add (t28);


    r2.add (l29);


    r2.add (t29);




    r4.add (l32);


    r4.add (t32);


    r4.add (l33);


    r4.add (t33);


    r4.add (l34);


    r4.add (t34);


    r1.add (l26);

    r3.add (l31);

    panel4.add (r1);


    panel4.add (r2);


    panel4.add (r3);


    panel4.add (r4);




    l36 = new Label ("your achivements", SwingConstants.CENTER);


    l37 = new Label ("achivement-1:");


    ta3 = new TextArea (500, 500);


    l38 = new Label ("achivement-2:");


    ta4 = new TextArea (500, 500);


    l39 = new Label ("achivement-3:");


    ta5 = new TextArea (500, 500);


    l36.setFont (new Font ("Serif", Font.PLAIN, 24));


    l37.setFont (new Font ("Serif", Font.PLAIN, 18));


    l38.setFont (new Font ("Serif", Font.PLAIN, 18));


    l39.setFont (new Font ("Serif", Font.PLAIN, 18));


    panel5.add (l36);


    panel5.add (l37);


    panel5.add (ta3);


    panel5.add (l38);


    panel5.add (ta4);


    panel5.add (l39);


    panel5.add (ta5);



    b1 = new Button ("RESET");


    b2 = new Button ("GENERATE RESUME");



    l41 = new Label ("");



    b4 = new Button ("EXIT");




    b1.addActionListener (this);

    b2.addActionListener (this);


    b4.addActionListener (this);

    d1.add (b1);

    d1.add (b2);



    d1.add (b4);

    panel6.add (d1);









    Border blackline1 =
      BorderFactory.createTitledBorder ("PERSONAL INFORMATION");



    panel1.setBorder (blackline1);


    Border blackline2 = BorderFactory.createTitledBorder ("QUALIFICATIONS");


    panel2.setBorder (blackline2);


    Border blackline3 =
      BorderFactory.createTitledBorder ("PROJECTS AND WORK EXPERIENCE");


    panel3.setBorder (blackline3);


    Border blackline4 =
      BorderFactory.createTitledBorder ("SKILLS AND HOBBIES");


    panel4.setBorder (blackline4);


    Border blackline5 = BorderFactory.createTitledBorder ("ACHIVEMENTS");


    panel5.setBorder (blackline5);


    mainpanel.add (panel1);


    mainpanel.add (panel2);


    mainpanel.add (panel3);


    mainpanel.add (panel4);


    mainpanel.add (panel5);


    mainpanel.add (panel6);


    add (mainpanel);


  }
  public void actionPerformed (ActionEvent ae)
  {

if (ae.getSource () == b2)


      {


	try
	{

Scanner sc = new Scanner(System.in);
String loc = sc.nextLine();

	  f1 = new FileWriter (loc);


	  f1.write
	    ("                                                   RESUME\n\n\n");


	  f1.write ("PERSONAL INFORMATION\n\n");


	  f1.write (l1.getText () + " : " + t1.getText () + "\n\n");


	  f1.write (l2.getText () + " : " + t2.getText () + "\n\n");


	  f1.write(l3.getText() +" : ");
    if(br1.isSelected())
    {
      f1.write("male\n\n");
    }
    else{
      f1.write("female\n\n");
    }
	  f1.write (l4.getText () + " : " + t4.getText () + "\n\n");


	  f1.write (l5.getText () + " : " + t5.getText () + "\n\n");


	  f1.write (l6.getText () + " : " + t6.getText () + "\n\n");


	  f1.write ("\n\n\n");


	  f1.write ("QUALIFICATIONS\n\n");


	  f1.write (l7.getText () + " : " + t7.getText () + "\n\n");


	  f1.write (l9.getText () + " : " + t9.getText () + "\n\n");


	  f1.write (l10.getText () + " : " + t10.getText () + "\n\n");


	  f1.write (l11.getText () + " : " + dropdown1.getSelectedItem () +
		    "\n\n");


	  f1.write (l12.getText () + " : " + t12.getText () + "\n\n");


	  f1.write (l13.getText () + " : " + t13.getText () + "\n\n");


	  f1.write (l14.getText () + " : " + dropdown2.getSelectedItem () +
		    "\n\n");


	  f1.write (l15.getText () + " : " + t15.getText () + "\n\n");


	  f1.write (l16.getText () + " : " + t16.getText () + "\n\n");


	  f1.write (l17.getText () + " : " + dropdown3.getSelectedItem () +
		    "\n\n");


	  f1.write ("\n\n\n");


	  f1.write ("PROJECTS AND WORK EXPERIENCE\n\n");


	  f1.write (l18.getText () + " : " + t18.getText () + "\n\n");


	  f1.write (l19.getText () + " : " + t19.getText () + "\n\n");


	  f1.write (l20.getText () + " : " + t20.getText () + "\n\n");


	  f1.write (l21.getText () + " : " + ta1.getText () + "\n\n");


	  f1.write (l22.getText () + " : " + t22.getText () + "\n\n");


	  f1.write (l23.getText () + " : " + t23.getText () + "\n\n");


	  f1.write (l24.getText () + " : " + t24.getText () + "\n\n");


	  f1.write (l25.getText () + " : " + ta2.getText () + "\n\n");


	  f1.write ("\n\n\n");


	  f1.write ("SKILLS AND HOBBIES\n\n");


	  f1.write ("SKILLS\n\n");


	  f1.write (l27.getText () + " : " + t27.getText () + "\n\n");


	  f1.write (l28.getText () + " : " + t28.getText () + "\n\n");


	  f1.write (l29.getText () + " : " + t29.getText () + "\n\n");





	  f1.write ("HOBBIES\n\n");


	  f1.write (l32.getText () + " : " + t32.getText () + "\n\n");


	  f1.write (l33.getText () + " : " + t33.getText () + "\n\n");


	  f1.write (l34.getText () + " : " + t34.getText () + "\n\n");






	  f1.write ("\n\n\n");


	  f1.write ("ACHIVEMENTS\n\n");



	  f1.write (l37.getText () + " : " + ta3.getText () + "\n\n");


	  f1.write (l38.getText () + " : " + ta4.getText () + "\n\n");


	  f1.write (l39.getText () + " : " + ta5.getText () + "\n\n");



	  f1.close ();


	  JOptionPane.showMessageDialog (null, "file written successfully");


	}

	catch (Exception e)
	{

	  JOptionPane.showMessageDialog (null, e + "");

	}


      }


    else if (ae.getSource () == b1)
      {

	t1.setText ("");


	t2.setText ("");



	t4.setText ("");


	t5.setText ("");


	t6.setText ("");


	t7.setText ("");


	t9.setText ("");


	t10.setText ("");



	t12.setText ("");


	t13.setText ("");


	t15.setText ("");


	t16.setText ("");


	t18.setText ("");


	t19.setText ("");


	t20.setText ("");


	ta1.setText ("");

	t22.setText ("");


	t23.setText ("");


	t24.setText ("");


	ta2.setText ("");


	t27.setText ("");


	t28.setText ("");


	t29.setText ("");


	t30.setText ("");


	t32.setText ("");

	t33.setText ("");

	t34.setText ("");

	t35.setText ("");

	ta3.setText ("");

	ta4.setText ("");

	ta5.setText ("");



      }

    else if (ae.getSource () == b4)

      {

	System.exit (0);

      }

  }


}
