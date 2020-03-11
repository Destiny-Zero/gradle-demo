package org.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 */
public class TimeUtils {

    /**
     * 获取年龄岁数
     *
     * @param birthDay 生日
     * @return 年龄
     */

    public static int getAgeByBirthDay(String birthDay) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = format.parse(birthDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int age = 0;
        Calendar cal = Calendar.getInstance();
        //出生日期晚于当前时间，无法计算
        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "出生日期晚于当前时间，无法计算!");
        }
        //当前年份
        int yearNow = cal.get(Calendar.YEAR);
        cal.setTime(date);
        int yearBirth = cal.get(Calendar.YEAR);
        //计算整岁数
        age = yearNow - yearBirth + 1;
        return age;
    }
}
