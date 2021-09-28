package com.company;

public class Main {

    public static void main(String[] args) {
    BitcoinInfo bitcoin = new BitcoinInfo();
	PriceRightNow infobitcoin = new PriceRightNow(bitcoin);
	bitcoin.setData(100000,133,-4);

    }
}
