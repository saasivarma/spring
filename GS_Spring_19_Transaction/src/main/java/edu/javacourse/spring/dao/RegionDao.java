package edu.javacourse.spring.dao;

import edu.javacourse.spring.model.Region;

/**
 * Author: Georgy Gobozov
 * Date: 21.07.13
 */
public interface RegionDao {

    public Integer createRegion(Region region);
    public void deleteRegion(Region region);
    public Region getRegionByName(String name);

}
