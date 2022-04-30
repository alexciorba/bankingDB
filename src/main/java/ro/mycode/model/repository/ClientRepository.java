package ro.mycode.model.repository;

import ro.mycode.model.model.Client;

import java.sql.ResultSet;
import java.sql.Statement;

public class ClientRepository extends Repository{

    public void addClient(Client client){
        String insertTo="";
        insertTo+=" insert into client";
        insertTo+="(id,nume,prenume,iban) ";
        insertTo+="values(";


        insertTo+=String.format(" '%d' , '%s' ,'%s', '%s' ",client.getId(),client.getNume(),client.getPrenume(),client.getIban()) ;
        insertTo+=")";
        exectuteStatement(insertTo);

    }
    public void deleteClient(int client){
        {
            String delete="";
            delete+=String.format("delete from client where id=%d",client);
            exectuteStatement(delete);

        }
    }
    Statement statement;
    private ResultSet Client(){
        exectuteStatement("select * from client ");
        try{

            return statement.getResultSet();
        }catch (Exception e){
            System.out.println("nu s a executat schita");
            return null;
        }
    }



    @Override
    public void exectuteStatement(String execute) {
        super.exectuteStatement(execute);
    }

}
