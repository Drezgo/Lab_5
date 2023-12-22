public class Dispetchering {
    Wallet wallet = new Wallet();
    Wallet2 wall2 = new Wallet2(0,0,0,36.93,39.33);
    Wallet3 wall3 = new Wallet3(0,0,0,36.93,39.33);
    Credit credit = new Credit();
    void menu (int num) {
        if (num == 1) {
            wallet.statistic();
        } else if (num == 2) {
            wall2.statisticsDemo();
        } else if (num == 3) {
            wall3.statistics();
        }
    }

}
