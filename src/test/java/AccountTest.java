import jdk.jfr.Description;
import org.example.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    @Description("Имя меньше 3 символов")
    public void testNameLess() throws Exception {
        Account account = new Account("Ti");
        Assert.assertTrue(account.checkNameToEmboss());
    }
    @Test
    @Description("Больше 19 символов")
    public void testNameMore() throws Exception {
        Account account = new Account("Тимоти Шаламеlfreo1q");
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    @Description("Больше 19 символов")
    public void testIsWhiteSpaceStart() throws Exception {
        Account account = new Account(" Тимоти Шаламе");
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    @Description("Положительный тест")
    public void testPositive() throws Exception {
        Account account = new Account("Тимоти Шаламе");
        Assert.assertTrue(account.checkNameToEmboss());
    }
}