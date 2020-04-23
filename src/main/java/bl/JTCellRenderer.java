/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author timon_kaufmann
 */
public class JTCellRenderer extends JTextArea implements TableCellRenderer
{

private static final long serialVersionUID = 1L;

public Component getTableCellRendererComponent(JTable table, Object value,
boolean isSelected, boolean hasFocus, 
int row, int column)
{
// Text setzen
setWrapStyleWord(true);
setLineWrap(true);
setText((String)value);


return this;
}

}
