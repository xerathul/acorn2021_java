package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dept.DeptDao;
import test.dept.DeptDto;

/*
 *  1. test.dept.dto.DeptDto 클래스를 만드세요
 *  2. test.dept.dao.DeptDao 클래스를 만드세요
 *  3. DeptDto 를 완성해 보세요.
 *  4. DeptDao 를 완성해 보세요.
 *  5. 위에 완성된 DeptDao 를 이용해서 아래 DeptFrame 을 구현해 보세요. 
 */

public class DeptFrame extends JFrame 
		implements  ActionListener, PropertyChangeListener{
	
	JTextField text_dname,  text_loc;
	DefaultTableModel model;
	JTable table;
	
	public DeptFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.pink);
		add(topPanel, BorderLayout.NORTH);
		
		JLabel label_dname= new JLabel("부서명");
		JLabel label_loc= new JLabel("부서위치");
		
		text_dname= new JTextField(10);
		text_loc= new JTextField(10);
		JButton btn_add=new JButton("추가");
		
		topPanel.add(label_dname);
		topPanel.add(text_dname);
		topPanel.add(label_loc);
		topPanel.add(text_loc);
		topPanel.add(btn_add);
		
		btn_add.setActionCommand("add");
		btn_add.addActionListener(this);
		
		table= new JTable();
		String[] colNames= {"부서번호","부서명","부서위치"};
		model= new DefaultTableModel(colNames, 0) {
			public boolean isCellEditable(int row, int column) {
				System.out.println(row+" 행"+column+" 열");
				if(column == 0) {
					return false;
				}else {
					return true;
				}
			}
		};
		
		table.setModel(model);
		JScrollPane scPane= new JScrollPane(table);
		add(scPane, BorderLayout.CENTER);
		printDept();
		
		JButton btn_delete=new JButton("삭제");
		btn_delete.addActionListener(this);
		btn_delete.setActionCommand("delete");
		
		topPanel.add(btn_delete);
		
		//new UpdateThread().start();
		
		table.addPropertyChangeListener(this);
	}
	
	public void printDept() {
		DeptDao dao= new DeptDao();
		List<DeptDto> list= dao.selectAll();
		model.setRowCount(0);
		
		for(DeptDto tmp:list) {
			Vector<Object> row=new Vector<>();
			row.add(tmp.getDeptno());
			row.add(tmp.getDname());
			row.add(tmp.getLoc());
			model.addRow(row);
			
		}
		
	}

	public static void main(String[] args) {
		DeptFrame d=new DeptFrame("부서정보 관리");
		d.setBounds(100, 100, 800, 500);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setVisible(true);
	}
	
	boolean isEditing=false;
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println("change!");
		System.out.println(evt.getPropertyName());
		
		if(evt.getPropertyName().equals("tableCellEditor")) {
			if(isEditing) {
				int selectediIndex= table.getSelectedRow();
				int deptno=(int)model.getValueAt(selectediIndex, 0);
				String dname=(String)model.getValueAt(selectediIndex, 1);
				String loc=(String)model.getValueAt(selectediIndex, 2);
				DeptDto dto= new DeptDto(deptno, dname, loc);
				new DeptDao().update(dto);
			}
			isEditing=!isEditing;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		if(command.equals("add")) {
			addDept();
		}else if(command.equals("delete")) {
			deleteDept();
		}
	}
	
	public void deleteDept() {
		int selectedIndex=table.getSelectedRow();
		if(selectedIndex == -1) {
			JOptionPane.showMessageDialog(this, "삭제할 행을 선택하세용");
			return;
		}
		int deptno=(int)table.getValueAt(selectedIndex, 0);
		int result=JOptionPane.showConfirmDialog(this, deptno+" 번 부서를 정말로 삭제하시겠습니까?");
		if(result == JOptionPane.YES_OPTION) {
			new DeptDao().delete(deptno);
			printDept();
		}
	}
	
	public void addDept() {
		String dname= text_dname.getText();
		String loc=text_loc.getText();
		
		DeptDto dto =new DeptDto();
		dto.setDname(dname);
		dto.setLoc(loc);
		
		DeptDao dao= new DeptDao();
		
		boolean isSuccess=dao.insert(dto);
		
		if(isSuccess) {
			JOptionPane.showMessageDialog(this, dname+ " 의 정보 추가 됨");
			printDept();
		}else {
			JOptionPane.showConfirmDialog(this, "추가 실패ㅠ");
			
		}
	}
	
}





