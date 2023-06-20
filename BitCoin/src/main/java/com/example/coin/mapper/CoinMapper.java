package com.example.coin.mapper;

import java.util.ArrayList;
import java.util.HashMap;

public interface CoinMapper {

    int buy(HashMap<String, String> params);

    ArrayList<HashMap<String, Object>> selectBuy(String email);

}
