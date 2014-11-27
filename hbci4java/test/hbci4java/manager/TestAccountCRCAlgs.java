package hbci4java.manager;

import org.junit.Assert;
import org.junit.Test;
import org.kapott.hbci.manager.AccountCRCAlgs;

public class TestAccountCRCAlgs {

    @Test
    public void test001() {
        //Beispiel Bundesbank
        Assert.assertTrue(AccountCRCAlgs.checkCreditorId("DE98ZZZ09999999999"));
        //Bund
        Assert.assertTrue(AccountCRCAlgs.checkCreditorId("DE09ZZZ00000000001"));
    }

    //Test, das alle anderen Pr�fziffern bei "DE98ZZZ09999999999" falsch sind
    @Test
    public void test002() {
        String prefix="DE";
        String postfix="ZZZ09999999999";
        for (int i=2; i<98; i++) {
            String mid = String.valueOf(i);
            if (i<10) mid = "0"+mid;
            Assert.assertFalse(prefix+mid+postfix, AccountCRCAlgs.checkCreditorId(prefix+mid+postfix));
        }
    }

}
