package br.com.erp.manageBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.erp.entity.Funcionario;

@SessionScoped
@ManagedBean(name = "FuncionarioBean")
public class FuncionarioBean {
	
	private Funcionario funcionario;
}
