package com.duapp.eripark.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Service interface for service to fetch some example information
 * from the backend
 */
@RequestMapping
public interface DataProviderService {

    /**
     * Returns the empty data result.
     * 
     * @return Empty data result.
     */
    @RequestMapping(value = "/public/dataprovider/getEmptyResult.ajax", method = RequestMethod.GET)
    public @ResponseBody
    DataResult getEmptyResult();

    /**
     * Returns the empty data result.
     * 
     * @return Empty data result.
     */
    @RequestMapping(value = "/public/dataprovider/getCategoryEntriesResult.ajax", method = RequestMethod.GET)
    public @ResponseBody
    CategoryEntriesResult getCategoryEntriesResult();

    /**
     * Returns the empty data result.
     * 
     * @return Empty data result.
     */
    @RequestMapping(value = "/public/dataprovider/getNewsTitleEntriesResult.ajax", method = RequestMethod.GET)
    public @ResponseBody
    NewsTitleEntriesResult getNewsTitleEntriesResult();

    /**
     * Returns the empty data result.
     * 
     * @return Empty data result.
     */
    @RequestMapping(value = "/public/dataprovider/getNewsResult.ajax", method = RequestMethod.GET)
    public @ResponseBody
    NewsResult getNewsResult();
    
    
    @RequestMapping(value = "/public/dataprovider/getPositionsResult.ajax", method = RequestMethod.GET)
    public @ResponseBody
    PositionsResult getPositions();
    
    @RequestMapping(value = "/public/dataprovider/getReturnEntitiesResult.ajax", method = RequestMethod.GET)
    public @ResponseBody
    ReturnEntitiesResult getReturnEntities(@RequestParam("location") String location);
    
    @RequestMapping(value = "/public/dataprovider/getReturnEntities2Result.ajax", method = RequestMethod.GET)
    public @ResponseBody
    ReturnEntities2Result getReturnEntities2(@RequestParam("id") int id);
}
