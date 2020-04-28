package mysys.tool;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;

public class dbPoolTest {

    @Test
    public void connectCase1Failed() {


        // if file does not exist, it will create a new file

        final String url="jdbc:sqlite:/Users/joeylam/db/sqlite-tools-osx-x86-3310100/xxx.db";
        dbPool db = new dbPool(url);
        boolean expValue = true;

        boolean actValue = db.connect();

        Assert.assertEquals(expValue, actValue);


    }


    @Test
    public void connectCase2Success() {


        final String url="jdbc:sqlite:/Users/joeylam/db/sqlite-tools-osx-x86-3310100/mydb.db";
        dbPool db = new dbPool(url);
        boolean expValue = true;

        boolean actValue = db.connect();

        Assert.assertEquals(expValue, actValue);


    }


    @Test
    public void getTxnCountTest1() {
        final String url="jdbc:sqlite:/Users/joeylam/db/sqlite-tools-osx-x86-3310100/mydb.db";
        dbPool db = new dbPool(url);
        db.connect();
        final int expValue = 14;
        final ResultSet rs = db.getTxn();
        int actValue = 0;

        try {

            while (rs.next()) {
                actValue++;
            }


        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        Assert.assertEquals(expValue, actValue);

    }
}