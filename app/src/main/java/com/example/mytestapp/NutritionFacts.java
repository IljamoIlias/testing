package com.example.mytestapp;

import android.content.res.Resources;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

import com.example.mytestapp.R;


public class NutritionFacts {

    public Integer KJPer100;
    public Integer KCalPer100;
    public Float FatsPer100;
    public Float SatsPer100;
    public Float MonounsatsPer100;
    public Float PolyunsatsPer100;
    public Float CarbsPer100;
    public Float SugarPer100;
    public Float AlcoholPer100;
    public Float AmylumPer100;
    public Float ProteinsPer100;
    public Float RoughagePer100;
    public Float SaltPer100;
    public Integer KJPerServing;
    public Integer KCalPerServing;
    public Float FatsPerServing;
    public Float SatsPerServing;
    public Float MonounsatsPerServing;
    public Float PolyunsatsPerServing;
    public Float CarbsPerServing;
    public Float SugarPerServing;
    public Float AlcoholPerServing;
    public Float AmylumPerServing;
    public Float ProteinsPerServing;
    public Float RoughagePerServing;
    public Float SaltPerServing;

    @NonNull
    public String getValue(@NonNull Resources res, @IntRange(from = 0, to = 11) int index, boolean per100) {
        switch (index) {
            case 0:
                if (per100 && KJPer100 != null && KCalPer100 != null) {
                    return res.getString(R.string.nutrition_fact_caloric, KJPer100, KCalPer100);
                } else if (!per100 && KJPerServing != null && KCalPerServing != null) {
                    return res.getString(R.string.nutrition_fact_caloric, KJPerServing, KCalPerServing);
                }
                break;
            case 1:
                if (per100 && FatsPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, FatsPer100);
                } else if (!per100 && FatsPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, FatsPerServing);
                }
                break;
            case 2:
                if (per100 && SatsPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, SatsPer100);
                } else if (!per100 && SatsPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, SatsPerServing);
                }
                break;
            case 3:
                if (per100 && MonounsatsPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, MonounsatsPer100);
                } else if (!per100 && MonounsatsPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, MonounsatsPerServing);
                }
                break;
            case 4:
                if (per100 && PolyunsatsPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, PolyunsatsPer100);
                } else if (!per100 && PolyunsatsPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, PolyunsatsPerServing);
                }
                break;
            case 5:
                if (per100 && CarbsPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, CarbsPer100);
                } else if (!per100 && CarbsPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, CarbsPerServing);
                }
                break;
            case 6:
                if (per100 && SugarPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, SugarPer100);
                } else if (!per100 && SugarPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, SugarPerServing);
                }
                break;
            case 7:
                if (per100 && AlcoholPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, AlcoholPer100);
                } else if (!per100 && AlcoholPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, AlcoholPerServing);
                }
                break;
            case 8:
                if (per100 && AmylumPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, AmylumPer100);
                } else if (!per100 && AmylumPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, AmylumPerServing);
                }
                break;
            case 9:
                if (per100 && ProteinsPer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, ProteinsPer100);
                } else if (!per100 && ProteinsPerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, ProteinsPerServing);
                }
                break;
            case 10:
                if (per100 && RoughagePer100 != null) {
                    return res.getString(R.string.nutrition_fact_grams, RoughagePer100);
                } else if (!per100 && RoughagePerServing != null) {
                    return res.getString(R.string.nutrition_fact_grams, RoughagePerServing);
                }
                break;
            case 11:
                if (per100 && SaltPer100 != null) {
                    if (SaltPer100 >= 1d) {
                        return res.getString(R.string.nutrition_fact_grams, SaltPer100);
                    } else {
                        return res.getString(R.string.nutrition_fact_salt, SaltPer100);
                    }
                } else if (!per100 && SaltPerServing != null) {
                    if (SaltPerServing >= 1d) {
                        return res.getString(R.string.nutrition_fact_grams, SaltPerServing);
                    } else {
                        return res.getString(R.string.nutrition_fact_salt, SaltPerServing);
                    }
                }
                break;
        }

        return "–";
    }

    @NonNull
    public String getPercent(@NonNull Resources res, @IntRange(from = 0, to = 11) int index) {
        switch (index) {
            case 0:
                if (KJPerServing != null) {
                    return getPercent(res, KJPerServing, 8400);
                } else if (KCalPerServing != null) {
                    return getPercent(res, KCalPerServing, 2000);
                }
                break;
            case 1:
                if (FatsPerServing != null) {
                    return getPercent(res, FatsPerServing, 70);
                }
                break;
            case 2:
                if (SatsPerServing != null) {
                    return getPercent(res, SatsPerServing, 20);
                }
                break;
            case 5:
                if (CarbsPerServing != null) {
                    return getPercent(res, CarbsPerServing, 260);
                }
                break;
            case 6:
                if (SugarPerServing != null) {
                    return getPercent(res, SugarPerServing, 90);
                }
                break;
            case 9:
                if (ProteinsPerServing != null) {
                    return getPercent(res, ProteinsPerServing, 50);
                }
                break;
            case 11:
                if (SaltPerServing != null) {
                    return getPercent(res, SaltPerServing, 6);
                }
                break;
        }

        return "";
    }

    @NonNull
    private String getPercent(@NonNull Resources res, @NonNull Number dividend, int divisor) {
        double percent = dividend.doubleValue() / divisor * 100;
        return res.getString(R.string.nutrition_fact_percent, percent);
    }

}
