package com.randioo.sihao_server.cache.local;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.mina.util.ConcurrentHashSet;

import com.randioo.sihao_server.entity.bo.Coord;

/**
 * 位置缓存
 * 
 * @author AIM
 *
 */
public class CoordCache {
	/** 路点的集合 */
	private static Set<Coord> roadSet = new ConcurrentHashSet<>();
	/** 路点映射 */
	private static Map<Integer, Map<Integer, Coord>> coordMap = new HashMap<>();

	public static Set<Coord> getRoadSet() {
		return roadSet;
	}

	public static Map<Integer, Map<Integer, Coord>> getCoordMap() {
		return coordMap;
	}
	
	
}
