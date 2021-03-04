package com.mrisk.monitoreo.application.repository;

import java.util.List;

import com.mrisk.monitoreo.domain.Point;

public interface PointRepository {
	
	List<Point> massiveSelectPoint();
	
	Point singleSelectPoint(Integer id);

	Point save(Point point);

}
