# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase6.test.ts >> Testcase 6 - Contact Us Form
- Location: tests\TestCase6.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

# Page snapshot

```yaml
- generic [ref=e1]:
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
  - generic [ref=e37]:
    - heading "Contact Us" [level=2] [ref=e41]:
      - text: Contact
      - strong [ref=e42]: Us
    - generic [ref=e43]:
      - generic [ref=e45]:
        - generic [ref=e46]:
          - text: "Note: Below contact form is for testing purpose."
          - link "Software testing tutorials" [ref=e47] [cursor=pointer]:
            - img [ref=e49]
            - text: Software testing tutorials
        - heading "Get In Touch" [level=2] [ref=e51]
        - generic [ref=e53]:
          - textbox "Name" [ref=e55]: Vetri
          - textbox "Email" [ref=e57]: bvetrivel@gmail.com
          - textbox "Subject" [ref=e59]: Demo mail
          - textbox "Your Message Here" [active] [ref=e61]: This is message
          - button "Choose File" [ref=e63]
          - button "Submit" [ref=e65] [cursor=pointer]
      - generic [ref=e67]:
        - heading "Feedback For Us" [level=2] [ref=e68]
        - generic [ref=e69]:
          - paragraph [ref=e70]: We really appreciate your response to our website.
          - paragraph [ref=e71]:
            - text: Kindly share your feedback with us at
            - link "feedback@automationexercise.com" [ref=e72]:
              - /url: mailto:feedback@automationexercise.com
            - text: .
          - paragraph [ref=e73]: If you have any suggestion areas or improvements, do let us know. We will definitely work on it.
          - paragraph [ref=e74]: Thank you
  - contentinfo [ref=e75]:
    - generic [ref=e80]:
      - heading "Subscription" [level=2] [ref=e81]
      - generic [ref=e82]:
        - textbox "Your email address" [ref=e83]
        - button "" [ref=e84] [cursor=pointer]:
          - generic [ref=e85]: 
        - paragraph [ref=e86]:
          - text: Get the most recent updates from
          - text: our site and be updated your self...
    - paragraph [ref=e90]: Copyright © 2021 All rights reserved
  - text: 
  - insertion [ref=e91]:
    - iframe [ref=e94]:
      - iframe [ref=f36e1]:
        - generic [active]:
          - generic [ref=f37e1]:
            - generic [ref=f37e2]:
              - generic:
                - img [ref=f37e6] [cursor=pointer]
                - button [ref=f37e8] [cursor=pointer]:
                  - img [ref=f37e9]
            - insertion [ref=f37e17]:
              - generic [ref=f37e18]:
                - link "Click Here" [ref=f37e19]:
                  - /url: https://googleads.g.doubleclick.net/dbm/clk?sa=L&ai=CWOkPYPM9atuXHpjujMwP1NaVwQ6uq9T0hwGPkMLfqRWhpvjz0B0QASD9tJ6VAWDlmuiD2A6gAYviiqAByAEJqAMByAObBKoEjwJP0Fghj-mY-uTwOWqf4GXDh1jxLj7cxnxkG8TC0TlUc0sxA-B8rnZHGNEziBx7ybhPfmDt6x6zyg1Xj0dDqRCcbLsNr0HcOSOPtJMc0juVyMXQ8AAMw5quA_zqPX7H7JnobdeWxf7d81pEMAJZCkXLZc_WOcXoWhMDYQNRIUgnicgxEwaYXK4w2_VXBvFiAHgLYsuCUSogJSYEhyVZi9r4HxmPc6BADIw_iyU7VxTcvZ9P7rDGxxzWsxHv-5TAtOpuLRuh132axKCGbuPJNQHIMJ5u-tvlqqn_crE_jVegt2HZ8jfnldvqUi9gkvIZVJd-6-3IUrHFswdDfDfQSoRrSgjh2HpUqLpac0ahW33PwATt9N3p8wTgBAOIBc-V8vRRkAYBoAZNgAfdnfXfAqgHp8yxAqgHpr4bqAfMzrECqAfz0RuoB5bYG6gHqpuxAqgHjs4bqAeT2BuoB_DgG6gH7paxAqgH_p6xAqgHr76xAqgH1ckbqAfZtrECqAeaBqgH_56xAqgH35-xAqgH-MKxAqgH-8KxAqgH59exAtgHANIIMwiAYRABGJ8DMgiKgoCAgICACDoPgECAwICAgICogAKog4AQSL39wTpYvKiM1_yjlQNgAYAKAZgLAcgLAYAMAaoNAklO6g0TCP_MjNf8o5UDFRg3gwMdVGsl6PANAYgOCbATkNj4ItATANgTDYgUAdgUAdAVAcoWAgoA-BYBgBcBshcEGAJQBrIYCRIC6FgYTSIBANAZAQ&ae=1&num=1&cid=CAQSiAIAEQoqgVjzXCOTmTp2LoFc8MTE49qRTRjziT2rAOwS8QPcJDcckVM87LXYJ_jNF9WExX8rRqJ_c7pOe6uEkJ-6YxdZkET8DAnPoeVu6UYpr3Ne73RZ61lv_xxe1K1uT38Ko6eRTOk5MiQcbNieL4PyPqPmr5--JptgaGg_LeoXMRPWcMwMt3-bs8tSrbXZGVOcnuJdCAReFB5rAPAsJ5CNiHUA2Svjt92Cf1CHoWA-GxXAE-XCVf0_JYX_LQgfWnNHkqkz2DbbzBhYdAhM6BHWVYEZfFOUvnCf94hioI7zkx72wlOs0QSLPM3xVmIg-6dtXcY5x3Zm9QAB0CIVZwFouPAjGuTbWSQYAQ&sig=AOD64_1lK72deh_9u7SQCtdTHrs9N6XB-g&client=ca-pub-1677597403311019&dbm_c=AKAmf-D71lMKESsrCvmK8QMK-O-GnxGBsnlINUsfbUqOF1z0qk88s4Npww9JQzRU1pGX_-gpaw4TVQrameRIdgj9l6mNBx6KReMqzQVpmIx1P3aOn_HMwFvX9oGR7HSg8hSHRvDWXgardBRzccoxwr9G5eTqpaupG5-C6uF8Xy5_nH1pSShVOM4iSaFrW0qy4mJT15bB8zFsXz7N4uQm_JYMn-PpUsgAZGMlHUNYScBAoeFtMoJNAearQ-nkJJBGP6IKPQ8zT7wh6v4UPTpG0mPd2zRWzRI_sxG-N_L__ivDCqKWU0rDjd4&cry=1&dbm_d=AKAmf-CFYYb-h3KAb5_W6fbCQPmupxIZHDU5VQihxlgdAn9AsRPcz9XfDl6YCQIbeDqlZDQkvlsje-9V2vacm2Zk-bG7aINWIFWE6LsD0P0jRbc1YhcOFZmL1r-SJPw6nuGU62c2nzAqjIzwQrCZKTFvXHSVET70o3-WVB-bOKrjvxyvbQH_WqJshN51THMX06SyGHw17MouDQLGKk90nfR0cYn5eeDQaR9ng1Nr2QcihGwcffcfXKsGrkc3OWNys55OjFO_xoSYyG6IyhZwA4Qm3W7lBm6dPMocLuZsYMrmSzkEI7vFGaT30Lqd_Vh6kJzjrN7vSn0FFE88MSwNj_O0-oy_2BnHVJieKMwgCw0cjzjx2OnUkvh8Mu93qisC2S1RckFQ3AT4RsrRCxLpQNFYojxatmLLRX1dQuVNs4iVjPZh6KPzAXDOpBeb7I0G55d33Rqc3l0_ak2dGJ33qFgz8wo5c9KlmFand685UfZlXvuCp9JwIgcJJaR0esDi4WgqabhUU7E9BmiIIw5uQI-JzbWRkt6kMMgpx6hVpF6bbmnd4qpjB0G27I22Ba_xHhGf4EMurMbhtJpyXc74VdNLugojlZvRj-loZn4_eEWUmsbgGd6Nv_dfvGSZYzjsl86JxZerk48kELiMSgz7aB0TRsaqZKIOe8c62BllIbflLm96Jyt8mJ6pIxE3mkcVDtEjX-AsZMnyOxVZ4YWHU7EaYS4tuLtNqA&adurl=https://servedby.flashtalking.com/click/7/296969;10263616;6077664;210;0/?us_privacy=!!US_PRIVACY!&ft_partnerimpid=ABAjH0hznb24l-ZpP-ZnleeGljaS&ft_impID=C9777BAA-60AC-93E6-5E86-9CA47993084D&ft_section=21988412111&g=67511182C8642D&random=546352.0612941366&ft_width=728&ft_height=90&url=https://www.adobe.com/in/creativecloud.html?sdid=PC1PQ9XF&mv=display&mv2=display
                  - img "Click Here" [ref=f37e20]
                - link "AdChoices arrow" [ref=f37e22]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img "AdChoices arrow" [ref=f37e23]
                - link "Privacy Notification" [ref=f37e25]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img [ref=f37e26]
                - link "Privacy Notification" [ref=f37e28]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img [ref=f37e29]
          - iframe [ref=f37e30]
          - iframe
```