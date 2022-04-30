package ro.mycode.model.repository;

import ro.mycode.model.model.Angajat;

import java.sql.ResultSet;
import java.sql.Statement;

public class AngajatRepository extends Repository {
    public void addAngajat(Angajat angajat){
        String insertTo="";
        insertTo+=" insert into angajat";
        insertTo+="(id,nume,prenume) ";
        insertTo+="values(";


        insertTo+=String.format(" '%d' , '%s' , %s ",angajat.getId(),angajat.getNume(),angajat.getPrenume()) ;
        insertTo+=")";
        exectuteStatement(insertTo);

    }
    public void deleteAngajat(int angajatId){
        {
            String delete="";
            delete+=String.format("delete from book where id=%d",angajatId);
            exectuteStatement(delete);

        }
    }
    Statement statement;
    private ResultSet Angajat(){
        exectuteStatement("select * from angajat ");
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
