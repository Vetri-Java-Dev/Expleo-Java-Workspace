# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase11.test.ts >> Testcase 11 - Verify Subscription in Cart page
- Location: tests\TestCase11.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - banner [ref=e2]:
    - generic [ref=e5]:
      - link "Website for automation practice" [ref=e8]:
        - /url: /
        - img "Website for automation practice" [ref=e9]
      - list [ref=e12]:
        - listitem [ref=e13]:
          - link " Home" [ref=e14]:
            - /url: /
            - generic [ref=e15]: 
            - text: Home
        - listitem [ref=e16]:
          - link " Products" [ref=e17]:
            - /url: /products
            - generic [ref=e18]: 
            - text: Products
        - listitem [ref=e19]:
          - link " Cart" [ref=e20]:
            - /url: /view_cart
            - generic [ref=e21]: 
            - text: Cart
        - listitem [ref=e22]:
          - link " Signup / Login" [ref=e23]:
            - /url: /login
            - generic [ref=e24]: 
            - text: Signup / Login
        - listitem [ref=e25]:
          - link " Test Cases" [ref=e26]:
            - /url: /test_cases
            - generic [ref=e27]: 
            - text: Test Cases
        - listitem [ref=e28]:
          - link " API Testing" [ref=e29]:
            - /url: /api_list
            - generic [ref=e30]: 
            - text: API Testing
        - listitem [ref=e31]:
          - link " Video Tutorials" [ref=e32]:
            - /url: https://www.youtube.com/c/AutomationExercise
            - generic [ref=e33]: 
            - text: Video Tutorials
        - listitem [ref=e34]:
          - link " Contact us" [ref=e35]:
            - /url: /contact_us
            - generic [ref=e36]: 
            - text: Contact us
  - generic [ref=e38]:
    - list [ref=e40]:
      - listitem [ref=e41]:
        - link "Home" [ref=e42]:
          - /url: /
      - listitem [ref=e43]: Shopping Cart
    - paragraph [ref=e46]:
      - text: Cart is empty! Click
      - link "here" [ref=e47]:
        - /url: /products
      - text: to buy products.
      - link "Building Materials & Supplies" [ref=e48] [cursor=pointer]:
        - img [ref=e50]
        - text: Building Materials & Supplies
    - insertion [ref=e53]:
      - generic [ref=e56]:
        - heading "These are topics related to the article that might interest you" [level=2] [ref=e58]: Discover more
        - link "Automation tutorials" [ref=e59] [cursor=pointer]:
          - generic "Automation tutorials" [ref=e60]
          - img [ref=e62]
        - link "Product affiliate marketing" [ref=e64] [cursor=pointer]:
          - generic "Product affiliate marketing" [ref=e65]
          - img [ref=e67]
        - link "Shopping cart optimization" [ref=e69] [cursor=pointer]:
          - generic "Shopping cart optimization" [ref=e70]
          - img [ref=e72]
  - contentinfo [ref=e74]:
    - generic [ref=e77]:
      - generic [ref=e79]: You have been successfully subscribed!
      - generic [ref=e81]:
        - heading "Subscription" [level=2] [ref=e82]
        - generic [ref=e83]:
          - textbox "Your email address" [ref=e84]: vetrivel@gmail.com
          - button "" [ref=e85] [cursor=pointer]:
            - generic [ref=e86]: 
          - paragraph [ref=e87]:
            - text: Get the most recent updates from
            - text: our site and be updated your self...
    - paragraph [ref=e91]: Copyright © 2021 All rights reserved
  - text: 
  - insertion [ref=e92]:
    - iframe [ref=e95]:
      - iframe [ref=f29e1]:
        - generic [active]:
          - generic [ref=f33e1]:
            - generic [ref=f33e2]:
              - generic:
                - img [ref=f33e6] [cursor=pointer]
                - button [ref=f33e8] [cursor=pointer]:
                  - img [ref=f33e9]
            - insertion [ref=f33e17]:
              - generic [ref=f33e18]:
                - link "Click Here" [ref=f33e19]:
                  - /url: https://googleads.g.doubleclick.net/dbm/clk?sa=L&ai=CiHUsNPM9as2_N9y3qfkPv_GpiQiuq9T0hwGPkMLfqRWhpvjz0B0QASD9tJ6VAWDlmuiD2A6gAYviiqAByAEJqAMByAObBKoEiQJP0PXUBT2jg6YqzxnT8ChfmM1ot83J493K3uqd0CAOa-J_ib_hY5tmn9ksr-xPfK8Ury9n03kpGMjJmnLIKj234foFY8F6EiBFI8XHPsQxAQU8oneBBq9wSKyvaYHlFi_-XTWja0qc2VaIxaVjziQQbAReCeBrMt6ctwwQ6N-wcMN1Ja6RCgESa_NLj829lmLmERGNzLU19iC-eSvCZP8ZRs07Tq0t5lCD7EEqfma2lGLh2ym3hnG3tj2NOnixRuEYJFws4vSD_hsL2dibz6faPgHpEqM0fYXTR_KgJ5uYuiKYikHu7z8Yug47fZyw2N8ZGYWjG8wg40nIJogFWqqlGxAy7u6PvCnAwATt9N3p8wTgBAOIBc-V8vRRkAYBoAZNgAfdnfXfAqgHp8yxAqgHpr4bqAfMzrECqAfz0RuoB5bYG6gHqpuxAqgHjs4bqAeT2BuoB_DgG6gH7paxAqgH_p6xAqgHr76xAqgH1ckbqAfZtrECqAeaBqgH_56xAqgH35-xAqgH-MKxAqgH-8KxAqgH59exAtgHANIIMwiAYRABGJ8DMgiKgoCAgICACDoPgECAwICAgICogAKog4AQSL39wTpYvIqowvyjlQNgAYAKAZgLAcgLAYAMAaoNAklO6g0TCOmvqML8o5UDFdxbKgkdv3gqgfANAYgOCbATkNj4ItATANgTDYgUAdgUAdAVAcoWAgoA-BYBgBcBshcEGAJQBrIYCRIC6FgYTSIBANAZAQ&ae=1&num=1&cid=CAQShwIAEQoqgdyPBRPo7UnYf9TrMeD60ZsX9ZcJlSXt8XTazjytOAW8ygYNYMmDLBUk7orrICf-ZW-m4I-jOOnFfdFuIZSxxUb1RBdKWfLTcGkXp2Jd4J6L2y-FZ_vXtNawS5ODywYigANGO_KFlePrZCdnrdYB0vw6ea4uhlPVoJr84YrsguvO_bFqQuOVVhl5ZVL1EQLIqXFtU3urz1I4lhyKdK417LPx3biN5L9DrN_y_sHKtWLwkbikIfsUPnsM1Q1hwjaKht92gtFtvWBH7-nKyyvxlWvHL6_iHbKIAtr0osmZ9JkYaYUUlq1FGxeuLvgqYVfFlCjhLzH0rO8lh6GanCgxrL_3mxgB&sig=AOD64_2FkFzg7E_6KmJNJBmSRZ9XhKQT1Q&client=ca-pub-1677597403311019&dbm_c=AKAmf-DWcQFDQyOkj82f0EUJvpfytZult-IX_omRN92wbRWTMwa-xvr2wlvRJWzf4g6fAE1S4WkMrclgzK15lklPOyc9TyFheyDBS7DvRBucON7KqJBFHVtLvPOoNcL-HUrLWumkAEVOcnrIPXvo8XejTPrqa7fMKWs3-BLIKf0KRAdNAg75skAW0cML0F8YVNLsPoUXP__XePfmkKJb8TWqY1ai-lVP7tV33sc6ettqq1hT4Va5g6y8nFJxTJF54GrLZS7AKYppy_DXaTX4Sb_BRRDI6Wp92ZbaIr8Dt07dV_HVbdQJ00k&cry=1&dbm_d=AKAmf-B51Bzar_z2gwTeEcazV0cW5D2VJynifcSkpvOnsqbn6lAPwiSefT5VSPogc8M1vg05fwCLjQtwLE9N4Y77rTc9hahbnLfnhX2NMqLSWJFki8_8zoj6FEaMlntN23sl3tuZxz1oIJ68YABSNZKJ3A4US9XexZhFg1afl8zqAY0wRicWBBjmsO9S5Te_5UfBiiIP8JNm-HGH7BXP4kSd9LYy54NxeHeQp6EIYBbEpFA-vdMWEgGfxLqeQADuNNTyES6ZJu9Pu4VadeqeLHr5OePuO2dmcxbncPa-QFgMD1Dzl24sbgVOEhvdPBwUoAfIypz8IahBgqIuG-rmb0MELZfupuCl9WqIW2i5Okift0v7ZEp7vPCjWi5SAubCVUsLhXj1QulhJvj52s2s97rOTyh13szSbHd6uccoiBJUWhw1RKorp9xYd762gz3pgvhIYONZSvlCN9ymPHw7oeBrgxqt2WGc7BViqdGNcXWlKX6sQvLUgQIJivb1n3w40Iu25X0BYphTVKig4Cc7xrZlSdCIAuftig-nmHfLn2jgbNiyVGrDY2uQISMEQ5DKh2ZsqM8CT2vgpatXWYdCuhS4Y3x0aAmnm_WiajdJvkMl3Mk1RfYydXOCpvHYcooDbrdNtDW9BvqzGFubKGOtATBPfC5Jxv1NIPp-uxByER3ADgffV3HoJqpibFq8wME-9oWqyqJIJvqk&adurl=https://servedby.flashtalking.com/click/7/296969;10263616;6173714;210;0/?us_privacy=!!US_PRIVACY!&ft_partnerimpid=ABAjH0hUfaFAZhqVolhDMS0c-ZGU&ft_impID=251D1B64-E9FB-6006-1E39-39F6D473C2DA&ft_section=21988412111&g=67518325E63967&random=487655.250881965&ft_width=728&ft_height=90&url=https://www.adobe.com/in/creativecloud.html?sdid=PC1PQ9XF&mv=display&mv2=display
                  - img "Click Here" [ref=f33e20]
                - link "AdChoices arrow" [ref=f33e22]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img "AdChoices arrow" [ref=f33e23]
                - link "Privacy Notification" [ref=f33e25]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img [ref=f33e26]
                - link "Privacy Notification" [ref=f33e28]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img [ref=f33e29]
          - iframe
  - generic:
    - insertion:
      - iframe [ref=e97]:
        
```