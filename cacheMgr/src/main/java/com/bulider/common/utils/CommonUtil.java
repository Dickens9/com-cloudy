/*package com.bulider.common.utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gzl.b2c.user.entity.CuUserExtend;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.NestedNullException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

public class CommonUtil {

    private static final Logger log = LoggerFactory.getLogger(CommonUtil.class);

    public static PageRequest getPageable(String sortField, String sortOrder, int offset, int limit) {
        int page = (int) (offset / limit);
        Direction direction = Direction.ASC;
        if (Direction.DESC.toString().equals(sortOrder)) {
            direction = Direction.DESC;
        }
        PageRequest pageable = new PageRequest(page, (int) limit, direction, sortField);
        return pageable;
    }

    public static PageRequest getPageable(int offset, int limit) {
        int page = (int) (offset / limit);
        PageRequest pageable = new PageRequest(page, (int) limit);
        return pageable;
    }

    public static Sort getSort(String sortField, String sortOrder) {
        Sort sort = null;
        if (StringUtils.isNotBlank(sortField)) {
            Direction direction = Direction.ASC;
            if (Direction.DESC.toString().equals(sortOrder)) {
                direction = Direction.DESC;
            }
            sort = new Sort(direction, sortField);
        }
        return sort;
    }

    @SuppressWarnings("rawtypes")
    public static List<Map<String, String>> constructMapList(List beans, String namesStr) {
        String[] names = namesStr.split(",");
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        for (Object bean : beans) {
            mapList.add(constructMap(bean, names));
        }

        return mapList;
    }

    private static Map<String, String> constructMap(Object bean, String[] names) {
        Map<String, String> propertyMap = new HashMap<String, String>();
        for (String name : names) {
            try {
                propertyMap.put(name, BeanUtils.getProperty(bean, name));
                // log.debug("name : {}", name);
                // log.debug("property : {}", BeanUtils.getProperty(bean, name));
            } catch (NestedNullException e) {
                propertyMap.put(name, "");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return propertyMap;
    }

    public static <T> String getStr(T str) {
        if (str != null) {
            return String.valueOf(str);
        }
        return "";
    }


    public static String getName(CuUserExtend cuUserExtend){
        if(org.apache.commons.lang3.StringUtils.isNotEmpty(cuUserExtend.getNickName())){
            return cuUserExtend.getNickName();
        }
        if(org.apache.commons.lang3.StringUtils.isNotEmpty(cuUserExtend.getUserAccount())){
            return cuUserExtend.getUserAccount();
        }
        if(org.apache.commons.lang3.StringUtils.isNotEmpty(cuUserExtend.getMobileNo())){
            return cuUserExtend.getMobileNo().replaceAll(cuUserExtend.getMobileNo().substring(3, 7), "****");
        }
        return null;
    }

}
*/