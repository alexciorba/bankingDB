package ro.mycode.model.repository;

import ro.mycode.model.model.Cont;

import java.sql.ResultSet;
import java.sql.Statement;

public class ContRepository extends Repository{


    public void addCont(Cont cont){
        String insertTo="";
        insertTo+=" insert into cont";
        insertTo+="(id,idClient,sold) ";
        insertTo+="values(";


        insertTo+=String.format(" %d , %d , %d ",cont.getId(),cont.getIdClient(),cont.getSold()) ;
        insertTo+=")";
        exectuteStatement(insertTo);

    }

    public void deleteCont(int id){
        {
            String delete="";
            delete+=String.format("delete from cont where id=%d",id);
            exectuteStatement(delete);

        }
    }
    Statement statement;
    private ResultSet Cont(){
        exectuteStatement("select * from cont ");
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
