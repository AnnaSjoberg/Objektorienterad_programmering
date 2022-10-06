package Bankomaten.Sprint1;

import java.util.List;

public class Bank {
    private List<Employee> employeeList;
    private List<Client> clientList;

    public Bank(List<Employee> employeeList, List<Client> clientList) {
        this.employeeList = employeeList;
        this.clientList = clientList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void addNewClient (){

    }
    public void addNewEmployee (){

    }
    public void removeClient(){

    }
    public void removeEmployee(){

    }
}
