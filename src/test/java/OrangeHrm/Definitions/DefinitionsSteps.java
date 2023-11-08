package OrangeHrm.Definitions;

import OrangeHrm.Pages.AdminPage;
import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private AdminPage adminPage = new AdminPage(driver);



	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^the user fill out user (.*) and password (.*)$")
	public void fillOutLogin(String userName, String password) throws SQLException {
		this.loginPage = new LoginPage(driver);
		this.loginPage.fillOutLogin(userName, password);

	}


	@When("^el usuario llega hasta agregar empleado$")
	public void LlegarAddEmployee(){
		this.pimPage = new PimPage(driver);
		this.pimPage.LlegarAddEmployee();

	}

	@When("^el usuario ingresa first name (.*) middle Name (.*)  last name (.*)$")
	public void fillOutAddEmployee(String firstName, String middleName, String lastName ){
		this.pimPage = new PimPage(driver);
		this.pimPage.fillOutAddEmployee(firstName,middleName,lastName);
	}

	@When("^el usuario llego hasta admin$")
	public void llegarAdmin(){
		this.adminPage = new AdminPage(driver);
		this.adminPage.llegarAdmin();
	}

	@When("^el usuario esta buscando users (.*)$")
	public void buscarUsuario (String typeRole ){
		this.adminPage = new AdminPage(driver);
		this.adminPage.buscarUsario(typeRole);
	}




}