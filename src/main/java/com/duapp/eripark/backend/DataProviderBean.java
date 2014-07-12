package com.duapp.eripark.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

/**
 * The purpose of this class is to encapsulate logic for retrieving
 * StringProvider data.
 */
@Controller
public class DataProviderBean implements DataProviderService {

    private void setSuccessResult(DataResult result) {
        result.setResultCode(0);
        result.setResultMessage("success!");
    }

    @Override
    public DataResult getEmptyResult() {
        DataResult result = new DataResult();
        setSuccessResult(result);
        return result;
    }

    @Override
    public CategoryEntriesResult getCategoryEntriesResult() {
        CategoryEntriesResult result = new CategoryEntriesResult();
        List<CategoryEntry> categoryEntries = new ArrayList<CategoryEntry>();
        categoryEntries.add(new CategoryEntry("111", "111"));
        categoryEntries.add(new CategoryEntry("222", "222"));
        categoryEntries.add(new CategoryEntry("333", "333"));
        result.setCategoryEntries(categoryEntries);
        setSuccessResult(result);
        return result;
    }

    @Override
    public NewsTitleEntriesResult getNewsTitleEntriesResult() {
        NewsTitleEntriesResult result = new NewsTitleEntriesResult();
        List<NewsTitleEntry> newsTitleEntriesResult = new ArrayList<NewsTitleEntry>();
        newsTitleEntriesResult.add(new NewsTitleEntry("news111", "news111"));
        newsTitleEntriesResult.add(new NewsTitleEntry("news222", "news222"));
        newsTitleEntriesResult.add(new NewsTitleEntry("news333", "news333"));
        result.setNewsTitleEntries(newsTitleEntriesResult);
        setSuccessResult(result);
        return result;
    }

    @Override
    public NewsResult getNewsResult() {
        NewsResult result = new NewsResult("111", "news111", "newsContent111");
        setSuccessResult(result);
        return result;
    }
}
