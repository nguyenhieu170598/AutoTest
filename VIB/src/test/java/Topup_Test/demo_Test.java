package Topup_Test;


import General.otp;
import General.success_Payment;
import Topup.*;

import org.testng.annotations.Test;

public class demo_Test extends BaseTest {
    //Case 1: Thanh toán thành công thẻ điện thoại trả trước Viettel
    @Test
    public void viettel_Test() throws InterruptedException {
        topup_Front_Viettel_10 a = new topup_Front_Viettel_10(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 2: Thanh toán thành công thẻ điện thoại trả trước Viettel
    @Test
    public void viettel_Test_20() throws InterruptedException {
        topup_Front_Viettel_20 a = new topup_Front_Viettel_20(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 3: Thanh toán thành công thẻ điện thoại trả trước Viettel
    @Test
    public void viettel_Test_50() throws InterruptedException {
        topup_Front_Viettel_50 a = new topup_Front_Viettel_50(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 4: Thanh toán thành công thẻ điện thoại trả trước Viettel
    @Test
    public void viettel_Test_100() throws InterruptedException {
        topup_Front_Viettel_100 a = new topup_Front_Viettel_100(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 5: Thanh toán thành công thẻ điện thoại trả trước Viettel
    @Test
    public void viettel_Test_200() throws InterruptedException {
        topup_Front_Viettel_200 a = new topup_Front_Viettel_200(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 6: Thanh toán thành công thẻ điện thoại trả trước Viettel
    @Test
    public void viettel_Test_500() throws InterruptedException {
        topup_Front_Viettel_500 a = new topup_Front_Viettel_500(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 7: Thanh toán thành công thẻ điện thoại trả trước Mobi
    @Test
    public void mobi_Test() throws InterruptedException {
        topup_Front_Mobi_10 a = new topup_Front_Mobi_10(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 8: Thanh toán thành công thẻ điện thoại trả trước Mobi
    @Test
    public void mobi_Test_20() throws InterruptedException {
        topup_Front_Mobi_20 a = new topup_Front_Mobi_20(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 9: Thanh toán thành công thẻ điện thoại trả trước Mobi
    @Test
    public void mobi_Test_50() throws InterruptedException {
        topup_Front_Mobi_50 a = new topup_Front_Mobi_50(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 10: Thanh toán thành công thẻ điện thoại trả trước Mobi
    @Test
    public void mobi_Test_100() throws InterruptedException {
        topup_Front_Mobi_100 a = new topup_Front_Mobi_100(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 11: Thanh toán thành công thẻ điện thoại trả trước Mobi
    @Test
    public void mobi_Test_200() throws InterruptedException {
        topup_Front_Mobi_200 a = new topup_Front_Mobi_200(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 12: Thanh toán thành công thẻ điện thoại trả trước Mobi
    @Test
    public void mobi_Test_500() throws InterruptedException {
        topup_Front_Mobi_500 a = new topup_Front_Mobi_500(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 13: Thanh toán thành công thẻ điện thoại trả trước Vina
    @Test
    public void vina_Test() throws InterruptedException {
        topup_Front_Vina_10 a = new topup_Front_Vina_10(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        ///Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 14: Thanh toán thành công thẻ điện thoại trả trước Vina
    @Test
    public void vina_Test_20() throws InterruptedException {
        topup_Front_Vina_20 a = new topup_Front_Vina_20(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 15: Thanh toán thành công thẻ điện thoại trả trước Vina
    @Test
    public void vina_Test_50() throws InterruptedException {
        topup_Front_Vina_50 a = new topup_Front_Vina_50(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 16: Thanh toán thành công thẻ điện thoại trả trước Vina
    @Test
    public void vina_Test_100() throws InterruptedException {
        topup_Front_Vina_100 a = new topup_Front_Vina_100(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 17: Thanh toán thành công thẻ điện thoại trả trước Vina
    @Test
    public void vina_Test_200() throws InterruptedException {
        topup_Front_Vina_200 a = new topup_Front_Vina_200(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 18: Thanh toán thành công thẻ điện thoại trả trước Vina
    @Test
    public void vina_Test_500() throws InterruptedException {
        topup_Front_Vina_500 a = new topup_Front_Vina_500(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 19: Thanh toán thành công thêm số điện thoại
    @Test
    public void addTelephone_Test_Front_Mobi() throws InterruptedException {

        addTelephone_Front_Mobi e = new addTelephone_Front_Mobi(webDriver);
        e.goToInfo_Topup();
        //Thread.sleep(2000);

        addTelephone_Front a = new addTelephone_Front(webDriver);
        a.goToInfo_Topup();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 20:Thanh toán thành công điện thoại trả sau Viettel
    @Test
    public void viettel_Test_Behind() throws InterruptedException {

        topup_Behind_Viettel_10 e = new topup_Behind_Viettel_10(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 21:Thanh toán thành công điện thoại trả sau Viettel
    @Test
    public void viettel_Test_Behind_20() throws InterruptedException {

        topup_Behind_Viettel_20 e = new topup_Behind_Viettel_20(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 22:Thanh toán thành công điện thoại trả sau Viettel
    @Test
    public void viettel_Test_Behind_50() throws InterruptedException {

        topup_Behind_Viettel_50 e = new topup_Behind_Viettel_50(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 23:Thanh toán thành công điện thoại trả sau Viettel
    @Test
    public void viettel_Test_Behind_100() throws InterruptedException {

        topup_Behind_Viettel_100 e = new topup_Behind_Viettel_100(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 24:Thanh toán thành công điện thoại trả sau Viettel
    @Test
    public void viettel_Test_Behind_200() throws InterruptedException {

        topup_Behind_Viettel_200 e = new topup_Behind_Viettel_200(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 25:Thanh toán thành công điện thoại trả sau Viettel
    @Test
    public void viettel_Test_Behind_500() throws InterruptedException {

        topup_Behind_Viettel_500 e = new topup_Behind_Viettel_500(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

    //Case 26:Thanh toán thành công thêm điện thoại trả sau Viettel
    @Test
    public void addTelephone_Test_Behind_Viettel() throws InterruptedException {
        addTelephone_Behind_Viettel e = new addTelephone_Behind_Viettel(webDriver);
        e.check_Behind();
        //Thread.sleep(2000);

        addTelephone_Behind f = new addTelephone_Behind(webDriver);
        f.goToInfo_Topup();

        Thread.sleep(3000);

        Payment_Front b = new Payment_Front(webDriver);
        b.verify_Topup();
        //Thread.sleep(2000);

        success_Payment c = new success_Payment(webDriver);
        c.gotosuccess();
        //Thread.sleep(2000);

        otp d = new otp(webDriver);
        d.gotootp();
        Thread.sleep(2000);
    }

}
