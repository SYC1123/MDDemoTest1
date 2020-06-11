package com.example.mddemotest1;

import java.util.ArrayList;
import java.util.List;
public class DataSource
{
    public static final List<String> generateData(int size)
    {
        if (size <= 0)
            return null;
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            datas.add("这是用户名"+i);
        }
        return datas;
    }
}