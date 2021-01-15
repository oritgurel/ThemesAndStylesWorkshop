package com.workshop7.network.serviceModel

import com.google.gson.Gson

object MockData {
    private val gson = Gson()
    
    private val healthNewsJson = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 5477,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Sopan Deb and Marc Stein\",\n" +
            "            \"title\": \"Sixers’ Positive Virus Test Challenges N.B.A.’s Health Protocol\",\n" +
            "            \"description\": \"The Philadelphia 76ers and Nets continued a game even though a player who had been on the bench learned during play that he had tested positive for the coronavirus.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/08/sports/basketball/nets-sixers-seth-curry-coronavirus.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/09/sports/08nba-virus-print/08nba-virus-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T23:07:11Z\",\n" +
            "            \"content\": \"After the game, Embiid, who recently became a father, told ESPN that he plans to quarantine from his family until he is sure that he does not have the virus.\\r\\nThe Washington Wizards, who played Phila… [+1582 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Joseph Goldstein\",\n" +
            "            \"title\": \"Why 300 Doses of Vaccine Sat Unused in Freezers for 2 Weeks\",\n" +
            "            \"description\": \"Small numbers of doses have even been thrown out as New York City’s mass vaccination campaign gets off to a dispiriting start.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/08/nyregion/nyc-coronavirus-vaccine-delays.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/07/nyregion/07nyvirus-vaccineclinics1/07nyvirus-vaccineclinics1-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T16:38:12Z\",\n" +
            "            \"content\": \"The slow pace has touched off new tensions between Mr. Cuomo and Mayor Bill de Blasio. The two men, Democrats with a history of feuding, have frequently clashed over the response to the pandemic.\\r\\nOn… [+1280 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"The New York Times\",\n" +
            "            \"title\": \"U.S. Sets New Death and Daily Case Records\",\n" +
            "            \"description\": \"There were at least 4,111 deaths and 280,028 new cases on Thursday. Dr. Anthony Fauci warned that the high toll was likely to continue. Here’s the latest on the pandemic.\",\n" +
            "            \"url\": \"https://www.nytimes.com/live/2021/01/08/world/covid-19-coronavirus\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/08/science/08virus-brief-ledeall/08virus-brief-ledeall-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T10:51:21Z\",\n" +
            "            \"content\": \"LiveUpdated Jan. 8, 2021, 5:44 a.m. ET\\r\\nJan. 8, 2021, 5:44 a.m. ET\\r\\nThere were at least 4,111 deaths and 280,028 new cases in the country on Thursday. Some wealthy clients are trying to cut in line f… [+12886 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Ginia Bellafante\",\n" +
            "            \"title\": \"How the Wealthy Are Maneuvering to Get the Vaccine First\",\n" +
            "            \"description\": \"They probably won’t have much success. But that won’t stop them from trying.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/08/nyregion/coronavirus-vaccine-wealthy-nyc.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/10/nyregion/10Big01/10Big01-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T10:00:09Z\",\n" +
            "            \"content\": \"In December, Gov. Andrew M. Cuomo threatened sanctions of up to \$1 million (and the revocation of the right to practice) against doctors, nurses, urgent-care providers or any others who delivered the… [+2396 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Stan Schroeder\",\n" +
            "            \"title\": \"OnePlus to launch its smart wearable next week\",\n" +
            "            \"description\": \"OnePlus Band, the first wearable from smartphone brand OnePlus, is coming on Jan. 11. \\nThe company announced the launch date on its OnePlus India Twitter account, indicating that the launch will happen in India. The company did not announce details on pricing…\",\n" +
            "            \"url\": \"https://mashable.com/article/oneplus-band-launch/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F08%252Fe1%252Ff362d1fd08e740cfad41cb17fde7b090.2d00c.jpg%252F1200x630.jpg?signature=Uv8gZW8unfbajh6Pkke-4rX0z7s=\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:51:08Z\",\n" +
            "            \"content\": \"OnePlus Band, the first wearable from smartphone brand OnePlus, is coming on Jan. 11. \\r\\nThe company announced the launch date on its OnePlus India Twitter account, indicating that the launch will hap… [+963 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Marie Tae McDermott\",\n" +
            "            \"title\": \"How Restaurants Have Weathered the Pandemic\",\n" +
            "            \"description\": \"Friday: A family-owned restaurant went from being a popular buffet spot to only serving takeout food overnight. Ten months later, it is still here.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/08/us/ca-covid-restaurants.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/08/us/08californiatoday/merlin_182036889_86a64f40-585d-4ecb-be88-0687e770eac4-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T13:57:22Z\",\n" +
            "            \"content\": \"The family eschewed outdoor dining because of health risks. Both Mr. Kumar and his wife, Mamta Kumari, have pre-existing health conditions, making them particularly vulnerable to Covid-19. Their land… [+1206 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Jenna Wortham\",\n" +
            "            \"title\": \"As an Intense Winter Unfolds, Some Lessons From Herbalists\",\n" +
            "            \"description\": \"You and plants, together during a fearsomely uncertain time.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/08/style/as-an-intense-winter-unfolds-some-lessons-from-herbalists.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/10/fashion/00HERBALIST1/merlin_181522839_57c86342-32fb-46c2-b802-f73a96782184-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T18:06:46Z\",\n" +
            "            \"content\": \"\\\"I am a chef, and I love how we can integrate medicine into our foods, said Candace Taylor, 38, who lives in Winooski, Vt. I love using cinnamon, star anise, cardamom in dishes, which all support lun… [+1225 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"The New York Times\",\n" +
            "            \"title\": \"Vote Could Come Next Week; More Trump Aides Resign\",\n" +
            "            \"description\": \"The assistant speaker of the House said Democrats could vote on impeachment next week. With less than two weeks left of Donald Trump’s presidency, a wave of resignations hits his cabinet.\",\n" +
            "            \"url\": \"https://www.nytimes.com/live/2021/01/08/us/trump-biden\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/08/us/08transition-briefing-resignations/08transition-briefing-resignations-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T13:58:12Z\",\n" +
            "            \"content\": \"LiveUpdated Jan. 8, 2021, 9:04 a.m. ET\\r\\nJan. 8, 2021, 9:04 a.m. ET\\r\\nThe assistant speaker of the House said Democrats could vote on impeachment next week. With less than two weeks left of Donald Trum… [+13901 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Dr. Gupta explains why Covid-19 death projections keep increasing\",\n" +
            "            \"description\": \"CNN's Dr. Sanjay Gupta looks at the increasing number of Covid-19 cases and deaths in the United States and explains why health experts are unsure when these numbers will peak.\",\n" +
            "            \"url\": \"https://www.cnn.com/videos/health/2021/01/08/coronavirus-deaths-us-gupta-newday-vpx.cnn\",\n" +
            "            \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210108003525-covid-hospitalizations-0106-super-tease.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T13:32:57Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"Christina Maxouris, CNN\",\n" +
            "            \"title\": \"US sees five deadliest days since Covid-19 pandemic's start in last two weeks\",\n" +
            "            \"description\": \"In just less than two weeks, the US recorded its five deadliest days since the Covid-19 pandemic's start -- with more than 4,000 virus-related deaths reported Thursday.\",\n" +
            "            \"url\": \"https://www.cnn.com/2021/01/08/health/us-coronavirus-friday/index.html\",\n" +
            "            \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210108003525-covid-hospitalizations-0106-super-tease.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T07:22:41Z\",\n" +
            "            \"content\": \"(CNN)In just less than two weeks, the US recorded its five deadliest days since the Covid-19 pandemic's start -- with more than 4,000 virus-related deaths reported Thursday.\\r\\nThe nation's total Covid… [+5782 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"AJ Willingham, CNN\",\n" +
            "            \"title\": \"People at the US Capitol riot are being identified and losing their jobs\",\n" +
            "            \"description\": \"At least three men have lost their jobs as a result of their involvement in the unrest at the US Capitol Wednesday.\",\n" +
            "            \"url\": \"https://www.cnn.com/2021/01/07/us/capitol-riots-people-fired-jobs-trnd/index.html\",\n" +
            "            \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210106180136-05-capitol-protest-security-0106-super-tease.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T03:06:41Z\",\n" +
            "            \"content\": \"(CNN)As images and social media posts of Wednesday's insurrection at the US Capitol circulate online, some of those who were present are being identified, and some have lost or left their jobs becaus… [+3893 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"Opinion by Issac Bailey\",\n" +
            "            \"title\": \"Opinion: The jarring image of Black men cleaning up the Capitol\",\n" +
            "            \"description\": \"Issac Bailey writes that the video is the latest example of how Black Americans remained steadfast throughout our history come what may. It feels wrong that they had to pick up the pieces from a failed insurrection attempt that had it been successful would ha…\",\n" +
            "            \"url\": \"https://www.cnn.com/2021/01/08/opinions/jarring-video-of-black-men-cleaning-up-the-capitol-bailey/index.html\",\n" +
            "            \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210108095452-01-black-men-cleaning-up-after-capitol-riot-super-tease.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T15:39:48Z\",\n" +
            "            \"content\": \"Issac Bailey is a longtime journalist based in South Carolina and the Batten Professor for Communication Studies at Davidson College. He's the author of \\\"My Brother Moochie: Regaining Dignity in the … [+4157 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"ars-technica\",\n" +
            "                \"name\": \"Ars Technica\"\n" +
            "            },\n" +
            "            \"author\": \"Beth Mole\",\n" +
            "            \"title\": \"Biden says he’ll nix Trump policy of holding back 50% of vaccine supply\",\n" +
            "            \"description\": \"\\\"The President-elect believes we must accelerate distribution of the vaccine.\\\"\",\n" +
            "            \"url\": \"https://arstechnica.com/science/2021/01/biden-says-hell-nix-trump-policy-of-holding-back-50-of-vaccine-supply/\",\n" +
            "            \"urlToImage\": \"https://cdn.arstechnica.net/wp-content/uploads/2021/01/GettyImages-1295077254-760x380.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T18:31:05Z\",\n" +
            "            \"content\": \"Enlarge/ President-elect Joe Biden delivers remarks January 07, 2021 in Wilmington, Delaware. \\r\\n0 with 0 posters participating\\r\\nView more stories\\r\\nPresident-elect Joe Biden is reportedly planning to … [+6486 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Reuters Editorial\",\n" +
            "            \"title\": \"Moderna jab approved for use in Britain - Reuters\",\n" +
            "            \"description\": \"Britain's medical regulator on Friday approved Moderna's COVID-19 vaccine for use, the health ministry said. Edward Baran reports.\",\n" +
            "            \"url\": \"https://www.reuters.com/video/watch/idOVDUCN4VF\",\n" +
            "            \"urlToImage\": \"https://static.reuters.com/resources/r/?d=20210108&i=OVDUCN4VF&r=OVDUCN4VF&t=2\",\n" +
            "            \"publishedAt\": \"2021-01-08T16:08:09Z\",\n" +
            "            \"content\": \"Posted \\r\\nBritain's medical regulator on Friday approved Moderna's COVID-19 vaccine for use, the health ministry said. Edward Baran reports.\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Reuters Staff\",\n" +
            "            \"title\": \"Turkey reports 11479 new coronavirus cases, 186 deaths - Reuters\",\n" +
            "            \"description\": \"Turkey reported 11,479 new coronavirus cases in the last 24 hours, health ministry data showed on Friday, bringing the country's total number of cases to 2,307,581.\",\n" +
            "            \"url\": \"https://www.reuters.com/article/us-health-coronavirus-turkey/turkey-reports-11479-new-coronavirus-cases-186-deaths-idUSKBN29D263\",\n" +
            "            \"urlToImage\": \"https://static.reuters.com/resources/r/?m=02&d=20210108&t=2&i=1547124520&r=LYNXMPEH070ZC&w=800\",\n" +
            "            \"publishedAt\": \"2021-01-08T16:19:00Z\",\n" +
            "            \"content\": \"By Reuters Staff\\r\\nPeople attend the funeral of their relative, a victim of coronavirus disease (COVID-19), at Kilyos cemetery in Istanbul, Turkey, December 10, 2020. Picture taken December 10, 2020. … [+454 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Reuters Staff\",\n" +
            "            \"title\": \"Mainland China reports 53 new COVID-19 cases vs 63 a day earlier - Reuters\",\n" +
            "            \"description\": \"Mainland China reported 53 new COVID-19 cases on Jan. 7, down from 63 reported a day earlier, the country's national health authority said on Friday.\",\n" +
            "            \"url\": \"https://www.reuters.com/article/health-coronavirus-china-cases/mainland-china-reports-53-new-covid-19-cases-vs-63-a-day-earlier-idUSB9N2IH00P\",\n" +
            "            \"urlToImage\": \"https://s1.reutersmedia.net/resources_v2/images/rcom-default.png?w=800\",\n" +
            "            \"publishedAt\": \"2021-01-08T00:27:00Z\",\n" +
            "            \"content\": \"By Reuters Staff\\r\\nSHANGHAI, Jan 8 (Reuters) - Mainland China reported 53 new COVID-19 cases on Jan. 7, down from 63 reported a day earlier, the countrys national health authority said on Friday.\\r\\nThe… [+673 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Reuters Staff\",\n" +
            "            \"title\": \"Russia's Gamaleya applies for emergency COVID-19 vaccine use in the Philippines - Reuters\",\n" +
            "            \"description\": \"Russia's Gamaleya Research Institute has applied to the Philippine health regulator for emergency use authorization of its COVID-19 vaccine, the regulator said late Friday.\",\n" +
            "            \"url\": \"https://www.reuters.com/article/health-coronavirus-philippines-gamaleya/russias-gamaleya-applies-for-emergency-covid-19-vaccine-use-in-the-philippines-idUSL4N2JJ3QG\",\n" +
            "            \"urlToImage\": \"https://static.reuters.com/resources/r/?m=02&d=20210108&t=2&i=1547164299&r=LYNXMPEH071GN&w=800\",\n" +
            "            \"publishedAt\": \"2021-01-08T23:28:00Z\",\n" +
            "            \"content\": \"By Reuters Staff\\r\\nFILE PHOTO: Woman holds a vial labelled \\\"COVID-19 Coronavirus Vaccine\\\" over dry ice in this illustration taken, December 5, 2020. REUTERS/Dado Ruvic/Illustration/File Photo\\r\\nMANILA … [+350 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Elvira Pollina\",\n" +
            "            \"title\": \"Italy's Lombardy health chief leaves office after COVID-19 criticism - Reuters\",\n" +
            "            \"description\": \"The health chief in Italy's wealthy Lombardy region, one of the areas of the world hardest hit by the coronavirus pandemic, left office on Friday after months of criticism over his handling of the medical crisis.\",\n" +
            "            \"url\": \"https://www.reuters.com/article/us-health-coronavirus-italy-lombardy/italys-lombardy-health-chief-leaves-office-after-covid-19-criticism-idUSKBN29D1TK\",\n" +
            "            \"urlToImage\": \"https://s1.reutersmedia.net/resources_v2/images/rcom-default.png?w=800\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:13:00Z\",\n" +
            "            \"content\": \"MILAN (Reuters) - The health chief in Italys wealthy Lombardy region, one of the areas of the world hardest hit by the coronavirus pandemic, left office on Friday after months of criticism over his h… [+1594 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Reuters Staff\",\n" +
            "            \"title\": \"Mexican health regulator approves Curevac vaccine for stage 3 trials -official - Reuters\",\n" +
            "            \"description\": \"Mexican health regulator Cofepris has approved Curevac, a vaccine against COVID-19 made in Germany, for stage 3 clinical trials, the country's foreign minister, Marcelo Ebrard, said on Friday on Twitter.\",\n" +
            "            \"url\": \"https://www.reuters.com/article/health-coronavirus-mexico-vaccine/mexican-health-regulator-approves-curevac-vaccine-for-stage-3-trials-official-idUSS0N2EF01X\",\n" +
            "            \"urlToImage\": \"https://static.reuters.com/resources/r/?m=02&d=20210108&t=2&i=1547157573&r=LYNXMPEH071E9&w=800\",\n" +
            "            \"publishedAt\": \"2021-01-08T21:43:00Z\",\n" +
            "            \"content\": \"By Reuters Staff\\r\\nFILE PHOTO: Professor Gottfried Kremsner injects a vaccination against the coronavirus disease (COVID-19) from German biotechnology company CureVac to a volunteer at the start of a … [+402 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"reuters\",\n" +
            "                \"name\": \"Reuters\"\n" +
            "            },\n" +
            "            \"author\": \"Reuters Staff\",\n" +
            "            \"title\": \"Biden names national security official to oversee global health security - Reuters\",\n" +
            "            \"description\": \"President-elect Joe Biden plans to add a senior national security official overseeing global health security, restoring a government function cut by the Trump administration ahead of the novel coronavirus pandemic.\",\n" +
            "            \"url\": \"https://www.reuters.com/article/us-usa-biden-biodefense/biden-names-national-security-official-to-oversee-global-health-security-idUSKBN29D214\",\n" +
            "            \"urlToImage\": \"https://s1.reutersmedia.net/resources_v2/images/rcom-default.png?w=800\",\n" +
            "            \"publishedAt\": \"2021-01-08T15:26:00Z\",\n" +
            "            \"content\": \"By Reuters Staff\\r\\nWILMINGTON, Del. (Reuters) - President-elect Joe Biden plans to add a senior national security official overseeing global health security, restoring a government function cut by the… [+316 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}"

    private val entertaimentNewsJson = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 138,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Yahoo Entertainment\"\n" +
            "            },\n" +
            "            \"author\": \"Gerren Keith Gaynor\",\n" +
            "            \"title\": \"Miya Ponsetto arrested for assaulting Black teen, falsely accusing him of theft\",\n" +
            "            \"description\": \"Miya Ponsetto, the California woman known as “SoHo Karen” for falsely accusing a Black teen of stealing her cell phone and subsequently attacking him at a...\",\n" +
            "            \"url\": \"https://news.yahoo.com/miya-ponsetto-arrested-assaulting-black-035205511.html\",\n" +
            "            \"urlToImage\": \"https://s.yimg.com/uu/api/res/1.2/TVR6Uk2Wyt1H5SHBoAckcg--~B/aD02ODM7dz0xMDI0O2FwcGlkPXl0YWNoeW9u/https://media.zenfs.com/en/thegrio_yahoo_articles_946/a97897785ec40e5c4034a334bff97eaa\",\n" +
            "            \"publishedAt\": \"2021-01-08T03:52:05Z\",\n" +
            "            \"content\": \"A lawyer who represents the California woman known as ‘SoHo Karen’ says she has ‘not grasped the severity of her circumstances’\\r\\nMiya Ponsetto, the California woman known as “SoHo Karen” for falsely … [+2867 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Yahoo Entertainment\"\n" +
            "            },\n" +
            "            \"author\": \"BBC\",\n" +
            "            \"title\": \"Dearon 'Deezer D' Thompson: Tributes to ER star who has died at 55\",\n" +
            "            \"description\": \"The actor was in 190 episodes of the US hospital drama from 1994 to 2009.\",\n" +
            "            \"url\": \"https://news.yahoo.com/dearon-deezer-d-thompson-tributes-182451368.html\",\n" +
            "            \"urlToImage\": \"https://s.yimg.com/uu/api/res/1.2/aOhReEZ9I6Uld.gPO6l99A--~B/aD01NDk7dz05NzY7YXBwaWQ9eXRhY2h5b24-/https://media.zenfs.com/en-gb/bbc_us_articles_995/bad1f2220b8b065309a13b5691df37e4\",\n" +
            "            \"publishedAt\": \"2021-01-08T18:24:51Z\",\n" +
            "            \"content\": \"Thompson (right) appeared on a TV press tour with co-stars George Clooney and Anthony Edwards in 1995\\r\\nActor Dearon \\\"Deezer D\\\" Thompson, who played nurse Malik McGrath in 190 episodes of US hospital … [+1542 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Pitchfork\"\n" +
            "            },\n" +
            "            \"author\": \"Evan Minsker\",\n" +
            "            \"title\": \"DaBaby Arrested for Gun Possession\",\n" +
            "            \"description\": \"The rapper was arrested in Beverly Hills after police found a loaded weapon in his car\",\n" +
            "            \"url\": \"https://pitchfork.com/news/dababy-arrested-for-gun-possession/\",\n" +
            "            \"urlToImage\": \"https://media.pitchfork.com/photos/5ff7f10f9db1e3b2bcfdcad8/16:9/w_1280,c_limit/DaBaby.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T05:45:23Z\",\n" +
            "            \"content\": \"DaBaby was arrested Thursday in Beverly Hills for possession of a loaded and concealed firearm, TMZ and CBS Los Angeles report. The Beverly Hills Police Department told CBS that security at the Gucci… [+521 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"bleacher-report\",\n" +
            "                \"name\": \"Bleacher Report\"\n" +
            "            },\n" +
            "            \"author\": \"Rob Goldberg\",\n" +
            "            \"title\": \"Dodgers' Mookie Betts Announces Engagement to Girlfriend Brianna Hammonds\",\n" +
            "            \"description\": \"The Los Angeles Dodgers star announced the news on his Instagram account: \\\"[Brianna Hammonds] has been by my side since we were teenagers,\\\" Betts wrote in the...\",\n" +
            "            \"url\": \"https://bleacherreport.com/articles/10000112-dodgers-mookie-betts-announces-engagement-to-girlfriend-brianna-hammonds\",\n" +
            "            \"urlToImage\": \"https://media.bleacherreport.com/image/upload/x_148,y_60,w_227,h_151,c_crop/v1610135547/cctjavzmiwkr2vaeu5rh.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T20:05:43Z\",\n" +
            "            \"content\": \"Mookie Betts has continued his run of success, getting engaged to longtime girlfriend Brianna Hammonds.\\r\\nThe Los Angeles Dodgers star announced the news on Instagram:\\r\\n\\\"[Brianna] has been by my side … [+613 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"Capitol Rioter Arrested for Taking Over Nancy Pelosi's Office\",\n" +
            "            \"description\": \"Cops have arrested the guy they believe is the Capitol rioter who was photographed sitting at Nancy Pelosi's desk during the failed coup ... TMZ has confirmed. Federal law enforcement sources tell TMZ ... cops arrested Richard Barnett in Arkansas…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/08/capitol-rioter-nancy-pelosi-desk-arrested-arkansas-failed-coup/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/97/16by9/2021/01/06/97e5a23228b64dfda6373d61e113f179_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T19:24:07Z\",\n" +
            "            \"content\": \"Cops have arrested the guy they believe is the Capitol rioter who was photographed sitting at Nancy Pelosi's desk during the failed coup ... TMZ has confirmed.\\r\\nFederal law enforcement sources tell T… [+1387 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"'ER' Star Dearon 'Deezer D' Thompson Dead at 55\",\n" +
            "            \"description\": \"Deezer D, best known for his role as nurse Malik McGrath on 'ER' has died ... TMZ has learned. The actor, whose real name was Dearon Thompson, was found unresponsive at home Thursday morning in Los Angeles. His brother, Marshawn, tells us the…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/07/er-star-deezer-d-thompson-dead/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/11/16by9/2021/01/08/118cd8ebfb86489f845148b8c3b0261a_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T03:51:50Z\",\n" +
            "            \"content\": \"Deezer D, best known for his role as nurse Malik McGrath on \\\"ER\\\" has died ... TMZ has learned.\\r\\nThe actor, whose real name was Dearon Thompson, was found unresponsive at home Thursday morning in Los … [+666 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"FBI Investigating 'Inside Job' Involving Capitol Police, Other Staffers During Insurrection\",\n" +
            "            \"description\": \"The FBI has reasons to believe the mob of Trump supporters who stormed the Capitol not only premeditated the assault, but might have been aided by police and staffers in the building ... TMZ has learned. High ranking sources inside the Capitol…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/08/capitol-insurrection-fbi-inside-job-capitol-police-staffers-rioters/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/1b/16by9/2021/01/08/1b5eb44cf1614fb09d90b6c89f19e2ae_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T23:17:40Z\",\n" +
            "            \"content\": \"The FBI has reasons to believe the mob of Trump supporters who stormed the Capitol not only premeditated the assault, but might have been aided by police and staffers in the building ... TMZ has lear… [+2378 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"Bernice King Says Pro-Trump Rioters Should Be Punished\",\n" +
            "            \"description\": \"Martin Luther King Jr.'s daughter wants to see the rioters who stormed the Capitol get more than a slap on the wrist ... she says letting them off easy sends the wrong message. Bernice King tells TMZ ... she's disturbed the pro-Trump rioters had…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/08/bernice-king-pro-trump-rioters-capitol-punished-repercussions-coup-siege-mob/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/06/16by9/2021/01/07/062438d39f094d6394063de8097c46ff_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T08:20:54Z\",\n" +
            "            \"content\": \"Martin Luther King Jr.'s daughter wants to see the rioters who stormed the Capitol get more than a slap on the wrist ... she says letting them off easy sends the wrong message.\\r\\nBernice King tells TM… [+1042 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"Sheriff Swanson Says Racial Bias was at Play in D.C. with Pro-Trump Riot and BLM Protests\",\n" +
            "            \"description\": \"Race is a big factor in the way cops handled Wednesday's coup, especially when juxtaposed against the way law enforcement dealt with the BLM protests after George Floyd's death .. so says, Sheriff Chris Swanson. Sheriff Swanson, who famously put…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/08/sheriff-chris-swanson-capitol-riot-blm-protest-police-response-bias/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/93/16by9/2021/01/08/93a886058ebb4b8f9192af7ac9c1a680_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T08:40:25Z\",\n" +
            "            \"content\": \"Race is a big factor in the way cops handled Wednesday's coup, especially when juxtaposed against the way law enforcement dealt with the BLM protests after George Floyd's death .. so says, Sheriff Ch… [+1102 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"Ben Crump, Keyon Harrold, Jr.'s Parents Call Out Racial Injustices After SoHo 'Karen' Arrest\",\n" +
            "            \"description\": \"Miya Ponsetto's arrest for attempted robbery -- after attacking a 14-year-old boy and accusing him of stealing her phone -- isn't nearly enough, according to the child's parents ... who insist racism was involved in the incident. Keyon Harrold…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/08/ben-crump-keyon-harrold-parents-miya-ponsetto-arrest-soho-karen-racism/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/65/16by9/2021/01/08/6555b4b8cae34915b58ddce4574ca2fb_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T22:07:39Z\",\n" +
            "            \"content\": \"Miya Ponsetto's arrest for attempted robbery -- after attacking a 14-year-old boy and accusing him of stealing her phone -- isn't nearly enough, according to the child's parents ... who insist racism… [+1344 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TMZ\"\n" +
            "            },\n" +
            "            \"author\": \"TMZ Staff\",\n" +
            "            \"title\": \"TikTok Hype House's Tony Lopez Sued for Sexual Battery, Allegedly Solicited Minors\",\n" +
            "            \"description\": \"Tony Lopez -- one of the popular members of TikTok's Hype House -- used social media to \\\"groom\\\" and have sex with 2 teenage girls ... at least according to an explosive new lawsuit, but he denies the allegations. The underage girls -- suing under…\",\n" +
            "            \"url\": \"https://www.tmz.com/2021/01/07/tiktok-hype-house-member-tony-lopez-sued-sexual-battery-minor/\",\n" +
            "            \"urlToImage\": \"https://imagez.tmz.com/image/85/16by9/2021/01/07/8594989e18fa49309915eb434a109c62_xl.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T02:16:04Z\",\n" +
            "            \"content\": \"Tony Lopez -- one of the popular members of TikTok's Hype House -- used social media to \\\"groom\\\" and have sex with 2 teenage girls ... at least according to an explosive new lawsuit, but he denies the… [+1915 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Stereogum\"\n" +
            "            },\n" +
            "            \"author\": \"James Rettig\",\n" +
            "            \"title\": \"DaBaby Arrested For Carrying A Loaded Firearm\",\n" +
            "            \"description\": \"The world's best music blog.\",\n" +
            "            \"url\": \"https://www.stereogum.com/2112384/dababy-arrest-los-angeles-loaded-firearm/news/\",\n" +
            "            \"urlToImage\": \"https://static.stereogum.com/uploads/2021/01/dababy-arrest-firearm-1610074498.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T02:56:23Z\",\n" +
            "            \"content\": \"DaBaby was arrested in Los Angeles on Thursday afternoon while shopping on Rodeo Drive. Per TMZ, police surrounded the vehicle DaBaby was in after a store employee called law enforcement to report th… [+313 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Gothamist\"\n" +
            "            },\n" +
            "            \"author\": \"Jen Chung\",\n" +
            "            \"title\": \"\\\"SoHo Karen\\\" Who Falsely Accused Black Teen Of Theft Now In California Sheriff's Custody, NYPD Awaits Extradition\",\n" +
            "            \"description\": \"A screenshot of the woman wanted by NYPD for scratching and attacking Keyon Harrold and his teenage son at the Arlo Hotel.\\n \\n\\nThe 22-year-old tackled the 14-year-old boy in NYC, insisting he took her iPhone, when she actually left it in an Uber. [ more › ]\",\n" +
            "            \"url\": \"http://gothamist.com/news/soho-karen-who-falsely-accused-black-teen-theft-now-california-sheriffs-custody-nypd-awaits-extradition\",\n" +
            "            \"urlToImage\": \"https://cms.prod.nypr.digital/images/316243/fill-1200x650/\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:21:42Z\",\n" +
            "            \"content\": \"The woman seen in a viral video falsely claiming that a Black teenager stole her iPhone (when she had actually left it in an Uber) and then tackling the boy inside of a hotel in Manhattan has now bee… [+2875 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"20minutos.es\"\n" +
            "            },\n" +
            "            \"author\": \"redaccion@20minutos.es (Á. RONDÁN)\",\n" +
            "            \"title\": \"Las amistades de Ariana Grande no están convencidas con su compromiso: \\\"Se han precipitado\\\"\",\n" +
            "            \"description\": \"Pilló un tanto por sorpresa a propios y extraños, porque el anuncio de su compromiso matrimonial fue colocar un álbum de fotos en Instagram (eso sí, antes...\",\n" +
            "            \"url\": \"https://www.20minutos.es/noticia/4535429/0/las-amistades-de-ariana-grande-no-estan-tan-convencidas-con-su-compromiso-se-han-precipitado/\",\n" +
            "            \"urlToImage\": \"https://imagenes.20minutos.es/files/og_thumbnail/uploads/imagenes/2020/12/28/ariana-grande-y-dalton-gomez.jpeg\",\n" +
            "            \"publishedAt\": \"2021-01-08T11:28:02Z\",\n" +
            "            \"content\": \"Pilló un tanto por sorpresa a propios y extraños, porque el anuncio de su compromiso matrimonial fue colocar un álbum de fotos en Instagram (eso sí, antes su 215 millones se seguidores) y porque aún … [+2213 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Corriere.it\"\n" +
            "            },\n" +
            "            \"author\": \"Simona Marchetti\",\n" +
            "            \"title\": \"È morto Deezer D: era l'infermiere Malik McGrath di «ER»\",\n" +
            "            \"description\": \"L'attore, 55 anni, è stato trovato senza conoscenza nella sua casa di Los Angeles e per la famiglia è stato stroncato da un attacco di cuore. Nel 2009 aveva subìto un intervento chirurgico di sei ore per sostituire l'aorta\",\n" +
            "            \"url\": \"https://www.corriere.it/spettacoli/21_gennaio_08/morto-deezer-d-era-infermiere-malik-mcgrath-di-er-909f2c10-519b-11eb-a6a8-c2079b30388d.shtml\",\n" +
            "            \"urlToImage\": \"https://images2.corriereobjects.it/methode_image/socialshare/2021/01/08/702b880c-51a0-11eb-9e96-bbe55a5b7a24.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T11:05:14Z\",\n" +
            "            \"content\": \"Lo hanno ritrovato privo di conoscenza nella sua casa di Los Angeles e a nulla sono valsi i tentativi di rianimarlo. L’attore Dearon Thompson, altrimenti noto con il nome d’arte di Deezer D, è morto … [+236 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"WTMJ-TV\"\n" +
            "            },\n" +
            "            \"author\": \"Jackson Danbeck\",\n" +
            "            \"title\": \"Rittenhouse not violating bond after appearing at Mount Pleasant tavern, police say - WTMJ-TV\",\n" +
            "            \"description\": \"<ol><li>Rittenhouse not violating bond after appearing at Mount Pleasant tavern, police say  WTMJ-TV\\r\\n</li><li>Controversial Photos Show Accused Kenosha Gunman Kyle Rittenhouse At Bar  CBS Chicago\\r\\n</li><li>Kyle Rittenhouse Has Beer at Bar with Shirt that Say…\",\n" +
            "            \"url\": \"https://www.tmj4.com/news/local-news/rittenhouse-not-violating-bond-after-appearing-at-mount-pleasant-tavern-police-say\",\n" +
            "            \"urlToImage\": \"https://ewscripps.brightspotcdn.com/dims4/default/761949f/2147483647/strip/true/crop/440x231+0+12/resize/1200x630!/quality/90/?url=http%3A%2F%2Fewscripps-brightspot.s3.amazonaws.com%2F6f%2Ff0%2F474e193c403088355d105980dddd%2Fcapture.PNG\",\n" +
            "            \"publishedAt\": \"2021-01-08T21:30:00Z\",\n" +
            "            \"content\": \"MOUNT PLEASANT Mount Pleasant police say they received a report of Kyle Rittenhouse, accused of shooting and killing two people during protests in Kenosha, at a local pub while out on bond.\\r\\nThe pers… [+1818 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"INSIDER\"\n" +
            "            },\n" +
            "            \"author\": \"Moises Mendez II\",\n" +
            "            \"title\": \"'Soho Karen' Miya Ponsetto tells Gayle King 'enough' in CBS interview - Insider - INSIDER\",\n" +
            "            \"description\": \"<ol><li>'Soho Karen' Miya Ponsetto tells Gayle King 'enough' in CBS interview - Insider  INSIDER\\r\\n</li><li>Miya Ponsetto defends herself in wild interview after falsely accusing Black teen  Yahoo! Voices\\r\\n</li><li>“Soho Karen” is just as delightful as you mig…\",\n" +
            "            \"url\": \"https://www.insider.com/miya-ponsetto-gayle-king-cbs-interview-soho-karen-reactions-video-2021-1\",\n" +
            "            \"urlToImage\": \"https://i.insider.com/5ff8d6f0bde805001980bfe5?width=1200&format=jpeg\",\n" +
            "            \"publishedAt\": \"2021-01-08T22:14:13Z\",\n" +
            "            \"content\": \"Miya Ponsetto, the 22-year-old woman who falsely accused a 14-year-old Black boy of stealing her phone, is going viral again, this time for a heated on-air exchange with CBS host Gayle King that many… [+4415 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"VladTV\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"DaBaby Reportedly Arrested on Rodeo Drive After Cops Find Gun in His Car - VladTV\",\n" +
            "            \"description\": \"According to TMZ, rapper DaBaby has been arrested in Los Angeles on the famed Rodeo Drive during a brief shopping spree. TMZ reports that DaBaby wa...\",\n" +
            "            \"url\": \"https://www.vladtv.com/article/268562/dababy-reportedly-arrested-on-rodeo-drive-after-cops-find-gun-in-his-car\",\n" +
            "            \"urlToImage\": \"https://www.vladtv.com/images/size_fs/video-268562.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T02:31:00Z\",\n" +
            "            \"content\": \"According to TMZ, rapper DaBaby has been arrested in Los Angeles on the famed Rodeo Drive during a brief shopping spree. TMZ reports that DaBaby was arrested following a traffic stop during which tim… [+451 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Upstract.com\"\n" +
            "            },\n" +
            "            \"author\": \"editors\",\n" +
            "            \"title\": \"DaBaby Reportedly Arrested on Rodeo Drive After Cops Find Gun in His Car\",\n" +
            "            \"description\": \"According to TMZ, rapper DaBaby has been arrested in Los Angeles on the famed Rodeo Drive during a brief shopping spree. TMZ reports that DaBaby wa...\",\n" +
            "            \"url\": \"https://upstract.com/p/aqjp9h6y?ref=rss&rd=1\",\n" +
            "            \"urlToImage\": \"https://cdn.upstract.com/p/p9qet8SsMZUTKEKeW55o/aqjp9h6y/h6sccdpd9x_t.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T02:31:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Daily Beast\"\n" +
            "            },\n" +
            "            \"author\": \"Alaina Demopoulos\",\n" +
            "            \"title\": \"Miya Ponsetto’s Lawyer is ‘Very Concerned’ about ‘SoHo Karen's’ Mental Health\",\n" +
            "            \"description\": \"CBS This Morning\\r\\nThere was the “Daddy” hat. There was the wave of the hand, and imperious “All right, Gayle. Enough!” And, in Gayle King’s now viral-interview of Miya Ponsetto, the so-called “SoHo Karen” arrested for attacking a Black teen and falsely accusi…\",\n" +
            "            \"url\": \"https://www.thedailybeast.com/miya-ponsettos-lawyer-is-very-concerned-about-soho-karens-mental-health\",\n" +
            "            \"urlToImage\": \"https://img.thedailybeast.com/image/upload/c_crop,d_placeholder_euli9k,h_1228,w_2175,x_0,y_0/dpr_2.0/c_limit,w_740/fl_lossy,q_auto/v1610136445/Screen_Shot_2021-01-08_at_3.03.51_PM_a79oob\",\n" +
            "            \"publishedAt\": \"2021-01-08T20:18:22Z\",\n" +
            "            \"content\": \"There was the Daddy hat. There was the wave of the hand, and imperious All right, Gayle. Enough! And, in Gayle Kings now viral-interview of Miya Ponsetto, the so-called SoHo Karen arrested for attack… [+3285 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}"

    private val techNewsJson = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 2335,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Lifehacker.com\"\n" +
            "            },\n" +
            "            \"author\": \"David Murphy\",\n" +
            "            \"title\": \"What's a Simple Way to Video Chat with My Elderly Parents?\",\n" +
            "            \"description\": \"The pandemic has been rough on everyone, especially when it comes to maintaining connection with the people we love. Luckily, technology allows us to maintain these connections in all sorts of useful ways. Chats. Game nights. Video calls. You can even watch m…\",\n" +
            "            \"url\": \"https://lifehacker.com/whats-a-simple-way-to-video-chat-with-my-elderly-parent-1846011264\",\n" +
            "            \"urlToImage\": \"https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/wxjqaxm9uz2e9hxy5um9.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:00:00Z\",\n" +
            "            \"content\": \"The pandemic has been rough on everyone, especially when it comes to maintaining connection with the people we love. Luckily, technology allows us to maintain these connections in all sorts of useful… [+5689 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"engadget\",\n" +
            "                \"name\": \"Engadget\"\n" +
            "            },\n" +
            "            \"author\": \"Kris Holt\",\n" +
            "            \"title\": \"GM modernizes its logo to highlight its EV-centric future\",\n" +
            "            \"description\": \"As GM focuses more heavily on electric vehicles, the company is modernizing its classic logo. For over 50 years, the automaker had used underlined all-caps white lettering on a blue square. The latest emblem switches things up with a lowercase \\\"gm\\\" on a white…\",\n" +
            "            \"url\": \"https://www.engadget.com/gm-logo-branding-electric-vehicles-210607845.html\",\n" +
            "            \"urlToImage\": \"https://o.aolcdn.com/images/dims?resize=1200%2C630&crop=1200%2C630%2C0%2C0&quality=95&image_uri=https%3A%2F%2Fs.yimg.com%2Fos%2Fcreatr-uploaded-images%2F2021-01%2Fb5836ef0-51f1-11eb-bff7-17ad33326700&client=amp-blogside-v2&signature=cb04ad70223ecd343a96cbfe7c6c53833e5d2269\",\n" +
            "            \"publishedAt\": \"2021-01-08T21:06:07Z\",\n" +
            "            \"content\": \"As GM focuses more heavily on electric vehicles, the company is modernizing its classic logo. For over 50 years, the automaker had used underlined all-caps white lettering on a blue square. The lates… [+709 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"engadget\",\n" +
            "                \"name\": \"Engadget\"\n" +
            "            },\n" +
            "            \"author\": \"Igor Bonifacic\",\n" +
            "            \"title\": \"The Jeep Wrangler 4xe will be on display in AR during CES\",\n" +
            "            \"description\": \"Normally, one of the highlights of any tradeshow, particularly those with an automotive angle, is seeing the products that are announced at that event in person. But with CES an online-only affair this year due to the pandemic, brands have had to get creative…\",\n" +
            "            \"url\": \"https://www.engadget.com/fiat-chrysler-ces-2021-virtual-showcase-161137450.html\",\n" +
            "            \"urlToImage\": \"https://o.aolcdn.com/images/dims?resize=1200%2C630&crop=1200%2C630%2C0%2C0&quality=95&image_uri=https%3A%2F%2Fs.yimg.com%2Fos%2Fcreatr-uploaded-images%2F2021-01%2F6c3490c0-51ca-11eb-bf7e-0dcc8b25ca85&client=amp-blogside-v2&signature=f8d72b2b843d697f8e2cc1e5c8defbec9f396243\",\n" +
            "            \"publishedAt\": \"2021-01-08T16:11:37Z\",\n" +
            "            \"content\": \"Normally, one of the highlights of any tradeshow, particularly those with an automotive angle, is seeing the products that are announced at that event in person. But with CES an online-only affair th… [+729 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"engadget\",\n" +
            "                \"name\": \"Engadget\"\n" +
            "            },\n" +
            "            \"author\": \"Valentina Palladino\",\n" +
            "            \"title\": \"The latest iPad Air returns to a record-low price of \$559 on Amazon\",\n" +
            "            \"description\": \"A few models of the new iPad Air are on sale at Amazon right now. You can get the WiFi, 64GB versions in sky blue, rose gold or silver for \$559, which is \$40 off their normal price and the lowest we’ve seen them. It’s the first time in a while that more than …\",\n" +
            "            \"url\": \"https://www.engadget.com/apple-ipad-air-all-time-low-price-sale-amazon-155411352.html\",\n" +
            "            \"urlToImage\": \"https://o.aolcdn.com/images/dims?resize=1200%2C630&crop=1200%2C630%2C0%2C0&quality=95&image_uri=https%3A%2F%2Fs.yimg.com%2Fos%2Fcreatr-uploaded-images%2F2020-11%2Fab970620-2b33-11eb-9ff7-944864a01768&client=amp-blogside-v2&signature=b996d21da444084f0ab7652e27cba3e827e31805\",\n" +
            "            \"publishedAt\": \"2021-01-08T15:54:11Z\",\n" +
            "            \"content\": \"This is the iPad Air that came out at the end of last year and we gave it a score of 90 for a number of reasons. Essentially, Apple gave the Air a lot of meaningful updates, including a faster A14 Bi… [+736 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"engadget\",\n" +
            "                \"name\": \"Engadget\"\n" +
            "            },\n" +
            "            \"author\": \"Billy Steele\",\n" +
            "            \"title\": \"Sony reveals full details on its upcoming 360 Reality Audio speakers\",\n" +
            "            \"description\": \"Earlier today, Sony announced plans to expand its 360 Reality Audio platform. The key updates were a two-fold approach for expanding the limited content library, licensing tech to other companies and — most importantly — news that it would ship its own speake…\",\n" +
            "            \"url\": \"https://www.engadget.com/sony-srs-ra5000-srs-ra3000-wireless-speakers-360-reality-audio-193931658.html\",\n" +
            "            \"urlToImage\": \"https://o.aolcdn.com/images/dims?resize=1200%2C630&crop=1200%2C630%2C0%2C0&quality=95&image_uri=https%3A%2F%2Fs.yimg.com%2Fos%2Fcreatr-uploaded-images%2F2021-01%2Ff3e238c0-51e2-11eb-bff7-2e7e9ba33dba&client=amp-blogside-v2&signature=b40ff40b5f112fc8d89a491cedc8b4cd4af8921d\",\n" +
            "            \"publishedAt\": \"2021-01-08T19:39:31Z\",\n" +
            "            \"content\": \"To properly project 360 Reality Audio in all directions, each speaker is capable of “ambient room-filling sound” that beams noise in all directions. If the content you’re listening to isn’t available… [+2212 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Kirsten Korosec\",\n" +
            "            \"title\": \"Holographic startup Envisics partners with Panasonic to fast-track in-car AR tech\",\n" +
            "            \"description\": \"Envisics founder and CEO Dr. Jamieson Christmas launched the startup three years ago to “revolutionize” the in-car experience with its holographic technology. Now, it has a partner that could help it achieve that mission. The U.K.-based holographic technology…\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/08/holographic-startup-envisics-partners-with-panasonic-to-fast-track-in-car-ar-tech/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2021/01/Envisics_Dashboard_Navigation_01.jpg?w=600\",\n" +
            "            \"publishedAt\": \"2021-01-08T23:14:41Z\",\n" +
            "            \"content\": \"Envisics founder and CEO Dr. Jamieson Christmas launched the startup three years ago to “revolutionize” the in-car experience with its holographic technology. Now, it has a partner that could help it… [+3130 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Rita Liao\",\n" +
            "            \"title\": \"Tencent investment stays on game in 2020\",\n" +
            "            \"description\": \"It’s no secret that Tencent, the Chinese tech giant behind WeChat and a handful of blockbuster video games, is an aggressive investor. Even during 2020 when the pandemic slowed down economic activity in many parts of the world, Tencent was charging ahead with…\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/07/tencent-investment-2020/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2021/01/GettyImages-479507311.jpg?w=600\",\n" +
            "            \"publishedAt\": \"2021-01-08T03:49:57Z\",\n" +
            "            \"content\": \"It’s no secret that Tencent, the Chinese tech giant behind WeChat and a handful of blockbuster video games, is an aggressive investor. Even during 2020 when the pandemic slowed down economic activity… [+5340 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Natasha Lomas\",\n" +
            "            \"title\": \"Google’s plan to replace tracking cookies goes under UK antitrust probe\",\n" +
            "            \"description\": \"Google’s plan to end support for third party cookies in the Chrome browser and its Chromium engine is under investigation by the UK’s Competition and Markets Authority (CMA). The antitrust regulator said today that it’s launched a probe under Chapter II of th…\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/08/googles-plan-to-replace-tracking-cookies-goes-under-uk-antitrust-probe/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2020/04/GettyImages-113173007.jpg?w=600\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:23:34Z\",\n" +
            "            \"content\": \"Google’s plan to end support for third party cookies in the Chrome browser and its Chromium engine is under investigation by the UK’s Competition and Markets Authority (CMA).\\r\\nThe antitrust regulator… [+6336 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Connie Loizos\",\n" +
            "            \"title\": \"Venrock’s Bryan Roberts on the firm’s new \$450 million fund, and where it’s shopping in 2021\",\n" +
            "            \"description\": \"Venrock, the 51-year-old venture firm that started as the venture arm of the Rockefeller family, has closed its ninth fund with \$450 million in capital commitments, the same amount the firm raised for its last two funds, closed in 2017 and 2014, respectively.…\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/08/venrocks-bryan-roberts-on-the-firms-new-450-million-fund-and-where-its-shopping-in-2021/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2021/01/Screen-Shot-2021-01-08-at-12.43.08-PM.png?w=764\",\n" +
            "            \"publishedAt\": \"2021-01-08T20:44:37Z\",\n" +
            "            \"content\": \"Venrock, the 51-year-old venture firm that started as the venture arm of the Rockefeller family, has closed its ninth fund with \$450 million in capital commitments, the same amount the firm raised fo… [+7497 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Kirsten Korosec\",\n" +
            "            \"title\": \"GM launches new logo to show its serious about its electric future\",\n" +
            "            \"description\": \"General Motors has changed its logo, refreshed its website and kicked off a new “Everybody In” marketing campaign as part of a broader effort to illustrate the company’s transformation to a modern, fast-moving and inclusive organization that is serious about …\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/08/gm-launches-new-logo-to-show-its-serious-about-its-electric-future/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2021/01/GM_NewLogo_Animation.2021-01-08-11_46_23.gif?w=711\",\n" +
            "            \"publishedAt\": \"2021-01-08T17:19:16Z\",\n" +
            "            \"content\": \"General Motors has changed its logo, refreshed its website and kicked off a new “Everybody In” marketing campaign as part of a broader effort to illustrate the company’s transformation to a modern, f… [+2729 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Anthony Ha\",\n" +
            "            \"title\": \"Daily Crunch: Roku buys Quibi’s content library\",\n" +
            "            \"description\": \"Quibi’s content will live on, Hyundai may partner with Apple and Donald Trump returns to Twitter. This is your Daily Crunch for January 8, 2021. The big story: Roku buys Quibi’s content library If you’re wondering what will happen to Quibi shows like “Most Da…\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/08/daily-crunch-roku-buys-quibis-content-library/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2021/01/Live-TV-Guide-Button.jpg?w=764\",\n" +
            "            \"publishedAt\": \"2021-01-08T23:14:09Z\",\n" +
            "            \"content\": \"Quibi’s content will live on, Hyundai may partner with Apple and Donald Trump returns to Twitter. This is your Daily Crunch for January 8, 2021.\\r\\nThe big story: Roku buys Quibi’s content library\\r\\nIf … [+2837 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"techcrunch\",\n" +
            "                \"name\": \"TechCrunch\"\n" +
            "            },\n" +
            "            \"author\": \"Lucas Matney\",\n" +
            "            \"title\": \"VCs discuss gaming’s biggest infrastructure investment opportunities in 2021\",\n" +
            "            \"description\": \"We last polled our network of investors on the topic of gaming infrastructure startups back in May just as it was becoming clear what pandemic opportunities were in store for gaming startups. Accel’s Amit Kumar told us at the time that “social and interactivi…\",\n" +
            "            \"url\": \"http://techcrunch.com/2021/01/08/vcs-discuss-gamings-biggest-infrastructure-investment-opportunities-in-2021/\",\n" +
            "            \"urlToImage\": \"https://techcrunch.com/wp-content/uploads/2020/06/GettyImages-134429666.jpg?w=533\",\n" +
            "            \"publishedAt\": \"2021-01-08T18:31:03Z\",\n" +
            "            \"content\": \"We last polled our network of investors on the topic of gaming infrastructure startups back in May just as it was becoming clear what pandemic opportunities were in store for gaming startups. \\r\\nAccel… [+4692 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Gizmodo.com\"\n" +
            "            },\n" +
            "            \"author\": \"Tom McKay\",\n" +
            "            \"title\": \"Tesla Knocks Facebook Off List of Top Five U.S. Companies by Market Cap\",\n" +
            "            \"description\": \"Elon Musk’s march towards either overseeing one of the biggest stock market bubble pops in recent history or being the guy who opens a solar-powered portal to Hell on Mars continues unabated: Tesla is now one of the country’s top five companies by market cap.…\",\n" +
            "            \"url\": \"https://gizmodo.com/tesla-knocks-facebook-off-list-of-top-five-u-s-compani-1846021662\",\n" +
            "            \"urlToImage\": \"https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/bjp9yn067w2ekx0qftrh.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T21:52:00Z\",\n" +
            "            \"content\": \"Elon Musks march towards either overseeing one of the biggest stock market bubble pops in recent history or being the guy who opens a solar-powered portal to Hell on Mars continues unabated: Tesla is… [+2756 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Jesse Green\",\n" +
            "            \"title\": \"Conspicuous Consumption, Getting More Conspicuous Onstage\",\n" +
            "            \"description\": \"Forget tragic lovers. At the Public Theater’s Under the Radar Festival, fast cars and other luxuries fuel tragedies about the love of things.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/08/theater/under-radar-festival-review.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/08/arts/08radar-review-2/08radar-review-2-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-08T19:13:06Z\",\n" +
            "            \"content\": \"Instagram would have you think so, which is a point Rich Kids makes in both content and format. The narration of Hossein and Parivashs story is never as vivid as the lurid photos assembled to illustr… [+1516 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Andy Moser\",\n" +
            "            \"title\": \"You should really be using the 'Hide Photo' feature on your iPhone\",\n" +
            "            \"description\": \"iPhones come with so many new features these days, it can be hard to keep track ... and sometimes to even know they exist. We hear ya. But those features can be extremely useful.\\nAll this brings us to the “Hide Photo” feature on your iPhone. Yeah, you should …\",\n" +
            "            \"url\": \"https://mashable.com/article/how-to-use-hide-photo-on-iphone/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F09%252F57%252F1e70648646d04a49b0dc3b5c0decf261.de32d.jpg%252F1200x630.jpg?signature=gMOoxxSre73nEubmLzv-uPdreoY=\",\n" +
            "            \"publishedAt\": \"2021-01-09T00:00:00Z\",\n" +
            "            \"content\": \"iPhones come with so many new features these days, it can be hard to keep track ... and sometimes to even know they exist. We hear ya. But those features can be extremely useful.\\r\\nAll this brings us … [+4488 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Stan Schroeder\",\n" +
            "            \"title\": \"OnePlus to launch its smart wearable next week\",\n" +
            "            \"description\": \"OnePlus Band, the first wearable from smartphone brand OnePlus, is coming on Jan. 11. \\nThe company announced the launch date on its OnePlus India Twitter account, indicating that the launch will happen in India. The company did not announce details on pricing…\",\n" +
            "            \"url\": \"https://mashable.com/article/oneplus-band-launch/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F08%252Fe1%252Ff362d1fd08e740cfad41cb17fde7b090.2d00c.jpg%252F1200x630.jpg?signature=Uv8gZW8unfbajh6Pkke-4rX0z7s=\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:51:08Z\",\n" +
            "            \"content\": \"OnePlus Band, the first wearable from smartphone brand OnePlus, is coming on Jan. 11. \\r\\nThe company announced the launch date on its OnePlus India Twitter account, indicating that the launch will hap… [+963 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Jack Morse\",\n" +
            "            \"title\": \"Reddit just banned r/DonaldTrump for 'inciting violence'\",\n" +
            "            \"description\": \"Reddit has had enough. \\nSix months after the discussion site banned r/The_Donald, a notoriously noxious subreddit dedicated to Donald Trump, the company moved to boot its likewise rotten sibling. The action follows the violent seizing of the U.S. Capitol by p…\",\n" +
            "            \"url\": \"https://mashable.com/article/reddit-bans-donald-trump-subreddit/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F08%252F2b%252Fcad5734930d64b1db75a15b1ab9f7edc.b1a2b.jpg%252F1200x630.jpg?signature=JnSW5Srtmev8c0_LHov94cvLKrM=\",\n" +
            "            \"publishedAt\": \"2021-01-08T18:25:01Z\",\n" +
            "            \"content\": \"Reddit has had enough. \\r\\nSix months after the discussion site banned r/The_Donald, a notoriously noxious subreddit dedicated to Donald Trump, the company moved to boot its likewise rotten sibling. Th… [+1543 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Miller Kern\",\n" +
            "            \"title\": \"This impressive Dell laptop is on sale for more than \$200 off\",\n" +
            "            \"description\": \"Save \$226: Grab the new Dell XPS 13-inch laptop for \$832.99 when you use the code SAVE15.\\n\\nCheap laptops are great for when your budget is more important than fancy features, but if you don't want to skimp out on specs while still trying to save a few bucks, …\",\n" +
            "            \"url\": \"https://mashable.com/shopping/jan-8-dell-xps-13-inch-laptop/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F08%252F9a%252Fb1d826551ef54a3f9e71931e9d1b1bd9.27207.png%252F1200x630.png?signature=clbnhAkPc85dH5Ux5YdsniGdKIg=\",\n" +
            "            \"publishedAt\": \"2021-01-08T14:49:25Z\",\n" +
            "            \"content\": \"Save \$226: Grab the new Dell XPS 13-inch laptop for \$832.99 when you use the code SAVE15.\\r\\nCheap laptops are great for when your budget is more important than fancy features, but if you don't want to… [+994 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Stan Schroeder\",\n" +
            "            \"title\": \"Hyundai and Apple are talking about Apple Car production\",\n" +
            "            \"description\": \"The Apple Car is turning from a myth to a potential product. \\nFollowing the recent report that Apple is looking into building a car and launching it by 2024, Korean automaker Hyundai has confirmed to CNBC that Apple has discussed the product with \\\"a variety o…\",\n" +
            "            \"url\": \"https://mashable.com/article/hyundai-apple-car/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F08%252Fac%252Fc8aae592701848f19f30ae1e0a80540d.9a726.jpg%252F1200x630.jpg?signature=ptjpgRHcNG42cBf-nQFJVROI9nI=\",\n" +
            "            \"publishedAt\": \"2021-01-08T09:32:39Z\",\n" +
            "            \"content\": \"The Apple Car is turning from a myth to a potential product. \\r\\nFollowing the recent report that Apple is looking into building a car and launching it by 2024, Korean automaker Hyundai has confirmed t… [+1522 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"mashable\",\n" +
            "                \"name\": \"Mashable\"\n" +
            "            },\n" +
            "            \"author\": \"Jack Morse\",\n" +
            "            \"title\": \"Twitter bans prominent QAnon figures, including Michael Flynn, citing 'potential for violence'\",\n" +
            "            \"description\": \"Twitter is finally fed up with QAnon.\\nThe social media giant banned several prominent figures in the QAnon conspiracy theory movement Friday. Those banned include Michael Flynn and Sydney Powell, Donald Trump's disgraced former national security advisor and d…\",\n" +
            "            \"url\": \"https://mashable.com/article/twitter-bans-qanon-michael-flynn-sydney-powell-jim-ron-watkins/\",\n" +
            "            \"urlToImage\": \"https://mondrian.mashable.com/2021%252F01%252F08%252F6a%252F20c5df2a5aa7474990cb54605ed2a4ed.0d3ae.png%252F1200x630.png?signature=OjY3-pjZT1bCVheCPcbtVDfaSA4=\",\n" +
            "            \"publishedAt\": \"2021-01-08T22:33:12Z\",\n" +
            "            \"content\": \"Twitter is finally fed up with QAnon.\\r\\nThe social media giant banned several prominent figures in the QAnon conspiracy theory movement Friday. Those banned include Michael Flynn and Sydney Powell, Do… [+1844 chars]\"\n" +
            "        }\n" +
            "    ]\n" +
            "}"

    private val headlines = "{\n" +
            "    \"status\": \"ok\",\n" +
            "    \"totalResults\": 38,\n" +
            "    \"articles\": [\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"cnn\",\n" +
            "                \"name\": \"CNN\"\n" +
            "            },\n" +
            "            \"author\": \"Evan Perez and Katelyn Polantz, CNN\",\n" +
            "            \"title\": \"DOJ announces charges against man carrying Pelosi's podium and others in US Capitol riot - CNN\",\n" +
            "            \"description\": \"Federal prosecutors have charged three individuals in connection with Wednesday's riot at the US Capitol, the Department of Justice announced Saturday, including a man seen on video carrying House Speaker Nancy Pelosi's lectern and another wearing a bearskin …\",\n" +
            "            \"url\": \"https://www.cnn.com/2021/01/09/politics/us-capitol-riot-arrests/index.html\",\n" +
            "            \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210109100929-johnson-mugshot-capitol-split-super-tease.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T18:32:00Z\",\n" +
            "            \"content\": \"(CNN)Federal prosecutors have charged three individuals in connection with Wednesday's riot at the US Capitol, the Department of Justice announced Saturday, including a man seen on video carrying Hou… [+2928 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"CNBC\"\n" +
            "            },\n" +
            "            \"author\": \"CNBC.com staff\",\n" +
            "            \"title\": \"Live Updates: GOP Senate can't take up Trump impeachment until day before Biden inauguration at earliest - CNBC\",\n" +
            "            \"description\": \"Senate Majority Leader Mitch McConnell said the chamber needs unanimous consent to do any business before Jan. 19.\",\n" +
            "            \"url\": \"https://www.cnbc.com/2021/01/09/capitol-riots-trump-and-biden-transition-news-live-updates.html\",\n" +
            "            \"urlToImage\": \"https://image.cnbcfm.com/api/v1/image/106818072-1609438642158-gettyimages-1230363159-STIMULUS_BLOCK.jpeg?v=1609438674\",\n" +
            "            \"publishedAt\": \"2021-01-09T18:01:00Z\",\n" +
            "            \"content\": \"Alaska Sen. Lisa Murkowski is the first Republican senator to call openly for President Trump's resignation in the wake of the mob attack on the U.S. Congress that left 5 people dead.\\r\\n\\\"I want him to… [+1291 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"nbc-news\",\n" +
            "                \"name\": \"NBC News\"\n" +
            "            },\n" +
            "            \"author\": \"Stella Kim, Adela Suliman\",\n" +
            "            \"title\": \"North Korea's Kim threatens to build more nukes and bring U.S. to its 'knees' as Trump's term ends - NBC News\",\n" +
            "            \"description\": \"Kim Jong Un called the United States North Korea's \\\"arch-enemy,\\\" swearing to bring the country \\\"to their knees,\\\" state media reported on Saturday.\",\n" +
            "            \"url\": \"https://www.nbcnews.com/news/world/north-korea-s-kim-threatens-build-more-nukes-bring-u-n1253625\",\n" +
            "            \"urlToImage\": \"https://media2.s-nbcnews.com/j/newscms/2021_01/3440973/210109-kim-jong-un-al-1213_26d458ce4880370b3a949fa2d303c431.nbcnews-fp-1200-630.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T17:26:00Z\",\n" +
            "            \"content\": \"Days before the end of President Donald Trump's time in office, North Korean dictator Kim Jong Un called the United States his country's \\\"arch-enemy,\\\" while threatening to expand its nuclear arsenal,… [+2523 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"nbc-news\",\n" +
            "                \"name\": \"NBC News\"\n" +
            "            },\n" +
            "            \"author\": \"Minyvonne Burke\",\n" +
            "            \"title\": \"Woman who falsely accused Black teen of phone theft returns to New York to face charges - NBC News\",\n" +
            "            \"description\": \"The woman who was arrested after a video showed her attacking and falsely accusing a Black teenager of stealing her cell phone arrived in New York City overnight to face charges, a police spokesperson said Saturday.\",\n" +
            "            \"url\": \"https://www.nbcnews.com/news/us-news/woman-who-falsely-accused-black-teen-phone-theft-returns-new-n1253629\",\n" +
            "            \"urlToImage\": \"https://media4.s-nbcnews.com/j/newscms/2021_01/3439996/210106-miya-ponsetto-al-0907_4bef3672ba33b6f90ffcecd497bb2a64.nbcnews-fp-1200-630.JPG\",\n" +
            "            \"publishedAt\": \"2021-01-09T16:48:00Z\",\n" +
            "            \"content\": \"The woman who was arrested after a video showed her attacking and falsely accusing a Black teenager of stealing her cell phone arrived in New York City overnight to face charges, a police spokesperso… [+2664 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Post\"\n" +
            "            },\n" +
            "            \"author\": \"Eileen AJ Connelly\",\n" +
            "            \"title\": \"CDC refutes report of new highly contagious COVID-19 strain in US - New York Post \",\n" +
            "            \"description\": \"There is no highly contagious new variant of the coronavirus in the US despite reports that a new strain of the deadly bug was circulating here. Officials said reports that suggested a new mutation…\",\n" +
            "            \"url\": \"https://nypost.com/2021/01/09/cdc-refutes-report-of-new-highly-contagious-covid-strain-in-us/\",\n" +
            "            \"urlToImage\": \"https://nypost.com/wp-content/uploads/sites/2/2021/01/210109-cdc-refutes-strain-report2.jpg?quality=90&strip=all&w=1200\",\n" +
            "            \"publishedAt\": \"2021-01-09T16:46:00Z\",\n" +
            "            \"content\": \"There is no highly contagious new variant of the coronavirus in the US despite reports that a new strain of the deadly bug was circulating here.\\r\\nOfficials said reports that suggested a new mutation … [+2111 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Dexerto\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Yoru officially revealed as Valorant’s 14th Agent: abilities, release date - Dexerto\",\n" +
            "            \"description\": \"Yoru is joining Valorant's Agent roster in Episode 2, with the Japanese duelist set to take Future Earth by storm with his invisible antics.\",\n" +
            "            \"url\": \"https://www.dexerto.com/valorant/yoru-valorant-reveal-abilities-release-date-1491840/\",\n" +
            "            \"urlToImage\": \"https://s3.us-east-1.amazonaws.com/dexerto-assets-production-cbbdf288/uploads/2021/01/09040837/Valorant-Yoru.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T16:17:23Z\",\n" +
            "            \"content\": \"Valorant fans have long been awaiting Episode 2: Act 1 and it’s finally dropping on January 12! From new Agent Yoru, to a host of skins — new and old — making their entrance in the battlepass, here’s… [+2933 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"the-verge\",\n" +
            "                \"name\": \"The Verge\"\n" +
            "            },\n" +
            "            \"author\": \"Cameron Faulkner\",\n" +
            "            \"title\": \"How to use your Oculus Quest 2 to play any PC VR game wirelessly - The Verge\",\n" +
            "            \"description\": \"The Oculus Quest 2 is capable, but there are many games it can’t play. Hooking it up with a wire is an option, but so is enabling the ability to play any PC virtual reality game without any wires. We’ll walk you through the latter option.\",\n" +
            "            \"url\": \"https://www.theverge.com/22218827/oculus-quest-2-wireless-pc-vr-games-how-to\",\n" +
            "            \"urlToImage\": \"https://cdn.vox-cdn.com/thumbor/-7XYhNCHC-bedOFn7XUrOX-SK9c=/0x103:1440x857/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/22220708/hero.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T16:00:00Z\",\n" +
            "            \"content\": \"Play the most visually demanding games while being untethered\\r\\nIf you buy something from a Verge link, Vox Media may earn a commission. See our ethics statement.\\r\\nOh hey, its all of my PC games avail… [+8700 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"the-washington-post\",\n" +
            "                \"name\": \"The Washington Post\"\n" +
            "            },\n" +
            "            \"author\": \"Miriam Berger\",\n" +
            "            \"title\": \"Indonesian plane with 62 aboard missing; fishermen spot possible debris - The Washington Post\",\n" +
            "            \"description\": \"Search teams were dispatched after the Sriwijaya Air Boeing 737-500 dropped off radar on a domestic flight.\",\n" +
            "            \"url\": \"https://www.washingtonpost.com/world/asia_pacific/indonesia-plane-crash-boeing/2021/01/09/3d91e7d0-5275-11eb-a1f5-fdaf28cfca90_story.html\",\n" +
            "            \"urlToImage\": \"https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/3IRB6DSSQ4I6XA7DGITEJWBDKY.jpg&w=1440\",\n" +
            "            \"publishedAt\": \"2021-01-09T15:54:00Z\",\n" +
            "            \"content\": \"Fifty-six passengers and six crew members were on board, AP reported. Other reports put the figures at 50 passengers as 12 crew members.\\r\\nFlightradar24, which monitors air traffic, wrote on its Twitt… [+2098 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"ESPN\"\n" +
            "            },\n" +
            "            \"author\": \"Marcel Louis-Jacques\",\n" +
            "            \"title\": \"Buffalo Bills wide receivers Stefon Diggs, Cole Beasley to play vs. Indianapolis Colts, source says - ESPN\",\n" +
            "            \"description\": \"Bills receivers Stefon Diggs, who set league highs with 127 catches and 1,535 yards this season, and Cole Beasley will play in Saturday's playoff game after being listed as questionable, a source told ESPN.\",\n" +
            "            \"url\": \"https://www.espn.com/nfl/story/_/id/30679284/buffalo-bills-wide-receiver-stefon-diggs-play-vs-indianapolis-colts-source-says\",\n" +
            "            \"urlToImage\": \"https://a3.espncdn.com/combiner/i?img=%2Fphoto%2F2020%2F1204%2Fr785695_1296x729_16%2D9.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T15:19:21Z\",\n" +
            "            \"content\": \"Buffalo Bills wide receivers Stefon Diggs and Cole Beasley, who were both listed as questionable with injuries, will play in Saturday's AFC wild-card game against the Indianapolis Colts, a source tol… [+754 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"business-insider\",\n" +
            "                \"name\": \"Business Insider\"\n" +
            "            },\n" +
            "            \"author\": \"Yelena Dzhanova\",\n" +
            "            \"title\": \"Top conservatives are moving to Parler after Trump's ban from Twitter - Business Insider - Business Insider\",\n" +
            "            \"description\": \"QAnon supporter Angela Stanton-King and Republican Rep. Thomas Massie are among those encouraging Twitter users to follow them on Parler.\",\n" +
            "            \"url\": \"https://www.businessinsider.com/top-conservatives-moving-to-parler-after-trumps-ban-from-twitter-2021-1\",\n" +
            "            \"urlToImage\": \"https://i.insider.com/5ff8fe85bde805001980c055?width=1200&format=jpeg\",\n" +
            "            \"publishedAt\": \"2021-01-09T15:18:34Z\",\n" +
            "            \"content\": \"Immediately following Twitter's permanent suspension of President Donald Trump on Friday night, top conservatives began sharing their Parler accounts on the platform, encouraging their followers to g… [+2729 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"business-insider\",\n" +
            "                \"name\": \"Business Insider\"\n" +
            "            },\n" +
            "            \"author\": \"John L. Dorman\",\n" +
            "            \"title\": \"GOP Sen. Josh Hawley was isolated 'in a corner' of a secure room 'with no one talking to him or acknowledging him' during Capitol siege: WSJ - Yahoo News\",\n" +
            "            \"description\": \"The post-riot pushback will likely threaten Hawley's effectiveness in the Senate going forward, especially with growing calls for him to resign.\",\n" +
            "            \"url\": \"https://www.businessinsider.com/josh-hawley-isolated-capitol-siege-riots-electoral-college-republican-blowback-2021-1\",\n" +
            "            \"urlToImage\": \"https://s.yimg.com/uu/api/res/1.2/IY1j6sVRTH6ANsEml9xaxg--~B/aD0xMzA2O3c9MTc0MjthcHBpZD15dGFjaHlvbg--/https://media.zenfs.com/en/business_insider_articles_888/0beeeeba7d28c63812219dec8e0a4b17\",\n" +
            "            \"publishedAt\": \"2021-01-09T15:05:00Z\",\n" +
            "            \"content\": \"<ul><li>When far-right rioters breached the Capitol during the Electoral College certification on Wednesday, numerous lawmakers were rushed into a secure room to escape the unfolding mayhem.\\r\\n</li><l… [+4400 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"associated-press\",\n" +
            "                \"name\": \"Associated Press\"\n" +
            "            },\n" +
            "            \"author\": \"Will Weissert\",\n" +
            "            \"title\": \"Democratic wins could strengthen Biden's legislative push - Associated Press\",\n" +
            "            \"description\": \"WASHINGTON (AP) — President-elect Joe Biden's victory in November was tempered by concerns that he would face Republican opposition in the Senate that could stymie him at every turn. Those...\",\n" +
            "            \"url\": \"https://apnews.com/article/election-2020-joe-biden-donald-trump-politics-georgia-4f6309e4635a57dccae6860ac6e7cc60\",\n" +
            "            \"urlToImage\": \"https://storage.googleapis.com/afs-prod/media/d2178965e1ca41d18e6fc883ec30929f/3000.jpeg\",\n" +
            "            \"publishedAt\": \"2021-01-09T14:32:38Z\",\n" +
            "            \"content\": \"WASHINGTON (AP) President-elect Joe Bidens victory in November was tempered by concerns that he would face Republican opposition in the Senate that could stymie him at every turn.\\r\\nThose worries ease… [+5113 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"TODAY\"\n" +
            "            },\n" +
            "            \"author\": \"TODAY.com\",\n" +
            "            \"title\": \"Alex Trebek’s final episode of ‘Jeopardy!’ ends with touching tribute - Today.com\",\n" +
            "            \"description\": \"“Jeopardy!” honored the late Alex Trebek with a tribute to the longtime quizmaster at the end of his final episode as host. The touching tribute featured clips from Trebek’s 36 years with the game show and reactions from fans have since poured in. One viewer …\",\n" +
            "            \"url\": \"https://www.today.com/video/alex-trebek-s-final-episode-of-jeopardy-ends-with-touching-tribute-99193413867\",\n" +
            "            \"urlToImage\": \"https://media14.s-nbcnews.com/j/MSNBC/Components/Video/202101/1610201747076_tdy_sat_allen_trebek_jeopardy_210109_1920x1080.social_share_1200x630_center.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T14:20:17Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"associated-press\",\n" +
            "                \"name\": \"Associated Press\"\n" +
            "            },\n" +
            "            \"author\": \"Aritz Parra\",\n" +
            "            \"title\": \"Snow blizzard kills 4, brings much of Spain to a standstill - The Associated Press\",\n" +
            "            \"description\": \"MADRID (AP) — A persistent blizzard has blanketed large parts of Spain with 50-year record levels of snow, killing at least four people and leaving thousands trapped in cars or in train stations...\",\n" +
            "            \"url\": \"https://apnews.com/article/madrid-storms-blizzards-la-liga-weather-e19062210d9856c4326e30d18f4f8a3b\",\n" +
            "            \"urlToImage\": \"https://storage.googleapis.com/afs-prod/media/e60c4da4ca7c44c485f6284239f1eeb4/3000.jpeg\",\n" +
            "            \"publishedAt\": \"2021-01-09T14:01:30Z\",\n" +
            "            \"content\": \"MADRID (AP) A persistent blizzard has blanketed large parts of Spain with 50-year record levels of snow, killing at least four people and leaving thousands trapped in cars or in train stations and ai… [+4722 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"New York Times\"\n" +
            "            },\n" +
            "            \"author\": \"Ben Shpigel\",\n" +
            "            \"title\": \"What to Watch for in Saturday’s N.F.L. Wild-Card Games - The New York Times\",\n" +
            "            \"description\": \"The first day of the expanded postseason kicks off with the Bills facing a franchise hero and the Colts, an N.F.C. West grudge match and the Washington rookie Chase Young getting his date with Tom Brady.\",\n" +
            "            \"url\": \"https://www.nytimes.com/2021/01/09/sports/football/nfl-wild-card-playoff-games.html\",\n" +
            "            \"urlToImage\": \"https://static01.nyt.com/images/2021/01/09/sports/09nfl-digest-1/09nfl-digest-1-facebookJumbo.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T13:54:31Z\",\n" +
            "            \"content\": \"The final game of the day, slated for 8:15 p.m. between fifth-seeded Tampa Bay and fourth-seeded Washington, showcases two quarterbacks who, based on all good sense, should not have been doing what t… [+1589 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"STAT\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"We lost to SARS-CoV-2 in 2020. We can defeat B-117 in 2021 - STAT - STAT\",\n" +
            "            \"description\": \"Humanity wasn't remotely prepared for SARS-Cov-2 when it emerged late in 2019. We are better prepared for the new virus, B-117\",\n" +
            "            \"url\": \"https://www.statnews.com/2021/01/09/we-lost-to-sars-cov-2-in-2020-we-can-defeat-b-117-in-2021/\",\n" +
            "            \"urlToImage\": \"https://www.statnews.com/wp-content/uploads/2021/01/50798186157_335e744e84_k-1024x576.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T13:32:31Z\",\n" +
            "            \"content\": \"We are barely a week into 2021 and already there are urgent warnings about a novel pandemic virus strain spreading surreptitiously and exponentially across the world.\\r\\nThis seems like déjà vu. But in… [+7791 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"NESN\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"How Patriots Would Have Fared With Tom Brady, Not Cam Newton, At QB In 2020 - NESN\",\n" +
            "            \"description\": \"The 2020 Patriots, as currently constructed, were not destined for the postseason whether Tom Brady or Cam Newton was playing quarterback.\",\n" +
            "            \"url\": \"https://nesn.com/2021/01/how-patriots-would-have-fared-with-tom-brady-not-cam-newton-at-qb-in-2020/\",\n" +
            "            \"urlToImage\": \"https://nesn.com/wp-content/uploads/sites/5/2021/01/Tom-Brady-7.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T13:04:55Z\",\n" +
            "            \"content\": \"With the Patriots at home and Tom Brady playing in the wild-card round of the postseason, it would be easy for Pats Nation to do some Monday morning quarterbacking on New England’s decision to let th… [+3431 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"Motley Fool\"\n" +
            "            },\n" +
            "            \"author\": \"Katie Brockman\",\n" +
            "            \"title\": \"Is It Really Possible to Retire With \$100,000 or Less in Savings? - The Motley Fool\",\n" +
            "            \"description\": \"You might be surprised at how far this money will go.\",\n" +
            "            \"url\": \"https://www.fool.com/retirement/2021/01/09/is-it-really-possible-to-retire-with-100000-or-les/\",\n" +
            "            \"urlToImage\": \"https://g.foolcdn.com/editorial/images/607253/older-woman-sitting-on-a-couch-looking-at-a-calculator.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T13:04:00Z\",\n" +
            "            \"content\": \"Saving enough to retire comfortably can be incredibly challenging. Around 65% of Americans have less than \$100,000 saved for retirement, according to a report from the Employee Benefit Research Insti… [+3424 chars]\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": \"google-news\",\n" +
            "                \"name\": \"Google News\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Coronavirus live updates: Here’s what to know in South Carolina on Jan. 9 - The State\",\n" +
            "            \"description\": null,\n" +
            "            \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMiP2h0dHBzOi8vd3d3LnRoZXN0YXRlLmNvbS9uZXdzL2Nvcm9uYXZpcnVzL2FydGljbGUyNDgzODUzNzUuaHRtbNIBP2h0dHBzOi8vYW1wLnRoZXN0YXRlLmNvbS9uZXdzL2Nvcm9uYXZpcnVzL2FydGljbGUyNDgzODUzNzUuaHRtbA?oc=5\",\n" +
            "            \"urlToImage\": null,\n" +
            "            \"publishedAt\": \"2021-01-09T12:20:00Z\",\n" +
            "            \"content\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"source\": {\n" +
            "                \"id\": null,\n" +
            "                \"name\": \"YouTube\"\n" +
            "            },\n" +
            "            \"author\": null,\n" +
            "            \"title\": \"Derrick Henry on his 2000-yard season and facing the Ravens in the AFC wild-card round | ESPN - ESPN\",\n" +
            "            \"description\": \"Tennessee Titans running back Derrick Henry sits down with Dianna Russini ahead of his team’s AFC wild-card game against the Baltimore Ravens to discuss his ...\",\n" +
            "            \"url\": \"https://www.youtube.com/watch?v=ETqmja1eXPY\",\n" +
            "            \"urlToImage\": \"https://i.ytimg.com/vi/ETqmja1eXPY/maxresdefault.jpg\",\n" +
            "            \"publishedAt\": \"2021-01-09T12:00:03Z\",\n" +
            "            \"content\": null\n" +
            "        }\n" +
            "    ]\n" +
            "}"

    val newsHeadlines = gson.fromJson(headlines, NewsResponse::class.java)
    val healthNews = gson.fromJson(healthNewsJson, NewsResponse::class.java)
    val entertainmentNews = gson.fromJson(entertaimentNewsJson, NewsResponse::class.java)
    val techNews = gson.fromJson(techNewsJson, NewsResponse::class.java)
}