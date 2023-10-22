package io.sim;


/**
 *
 * @author vinicius
 */
public interface CarObserver {
    void onRouteCompleted(Car car, Route route);
}
