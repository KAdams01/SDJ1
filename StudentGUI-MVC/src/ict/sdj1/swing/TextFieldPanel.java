package ict.sdj1.swing;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldPanel extends JPanel
{
   private static final long serialVersionUID = 1L;
   private JTextField[] textFields;
	private JLabel[] labels;

	public TextFieldPanel(LayoutManager layout, int size, String... textFieldLabels)
	{
		textFields = new JTextField[textFieldLabels.length];
		labels = new JLabel[textFieldLabels.length];
		for (int i = 0; i < textFields.length; i++)
		{
			textFields[i] = new JTextField(size);
			labels[i] = new JLabel(textFieldLabels[i]);
		}
		addComponentsToPanel(layout);
	}

	public TextFieldPanel(String... textFieldLabels)
	{
		this(new GridLayout(textFieldLabels.length, 1, 5, 5), 10, textFieldLabels); // vertical
	}

	private void addComponentsToPanel(LayoutManager layout)
	{
		if (layout == null)
		{
			layout = new GridLayout(textFields.length, 1, 5, 5);
		}
		setLayout(layout);
		if (layout instanceof BorderLayout)
		{
			String[] position =
			{ BorderLayout.NORTH, BorderLayout.SOUTH,
					BorderLayout.WEST, BorderLayout.EAST, BorderLayout.CENTER };
			int size = Math.min(position.length, textFields.length);
			
			for (int i = 0; i < size; i++)
			{
				JPanel onePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				onePanel.add(textFields[i]);
				onePanel.add(labels[i]);
				add(onePanel, position[i]);
			}
		}
		else
		{
			if (layout instanceof GridLayout)
			{
				if (((GridLayout) layout).getColumns()
						* ((GridLayout) layout).getRows() != textFields.length)
				{
					((GridLayout) layout).setVgap(5);
					((GridLayout) layout).setColumns(1);
					((GridLayout) layout).setRows(textFields.length);
				}
			}
			for (int i = 0; i < textFields.length; i++)
			{
				JPanel onePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				onePanel.add(textFields[i]);
				onePanel.add(labels[i]);
				add(onePanel);
			}
		}
	}

	// ..............

	public JTextField getTextField(int index)
	{
		if (index < textFields.length && index >= 0)
			return textFields[index];
		return null;
	}

	public JTextField getTextField(String text)
	{
		for (int i = 0; i < labels.length; i++)
			if (labels[i].getText().equals(text))
				return textFields[i];
		return null;
	}

	public void addActionListenerToAllTextFields(ActionListener listener)
	{
		if (listener == null)
			return;
		for (int i = 0; i < textFields.length; i++)
		{
			if (textFields[i] != null)
			{
				textFields[i].addActionListener(listener);
			}
		}
	}

	public void addActionListenerToOneTextField(ActionListener listener, int index)
	{
		JTextField oneTextField = getTextField(index);
		if (oneTextField != null)
			oneTextField.addActionListener(listener);
	}

	public void addActionListenerToOneTextField(ActionListener listener,
			String textFieldText)
	{
		JTextField oneTextField = getTextField(textFieldText);
		if (oneTextField != null)
			oneTextField.addActionListener(listener);
	}

}
