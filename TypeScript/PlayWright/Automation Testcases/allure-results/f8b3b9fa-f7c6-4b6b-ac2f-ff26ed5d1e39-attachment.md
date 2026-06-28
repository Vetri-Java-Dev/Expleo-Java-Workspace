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
      - link "Website for automation practice" [ref=e8] [cursor=pointer]:
        - /url: /
        - img "Website for automation practice" [ref=e9]
      - list [ref=e12]:
        - listitem [ref=e13]:
          - link " Home" [ref=e14] [cursor=pointer]:
            - /url: /
            - generic [ref=e15]: 
            - text: Home
        - listitem [ref=e16]:
          - link " Products" [ref=e17] [cursor=pointer]:
            - /url: /products
            - generic [ref=e18]: 
            - text: Products
        - listitem [ref=e19]:
          - link " Cart" [ref=e20] [cursor=pointer]:
            - /url: /view_cart
            - generic [ref=e21]: 
            - text: Cart
        - listitem [ref=e22]:
          - link " Signup / Login" [ref=e23] [cursor=pointer]:
            - /url: /login
            - generic [ref=e24]: 
            - text: Signup / Login
        - listitem [ref=e25]:
          - link " Test Cases" [ref=e26] [cursor=pointer]:
            - /url: /test_cases
            - generic [ref=e27]: 
            - text: Test Cases
        - listitem [ref=e28]:
          - link " API Testing" [ref=e29] [cursor=pointer]:
            - /url: /api_list
            - generic [ref=e30]: 
            - text: API Testing
        - listitem [ref=e31]:
          - link " Video Tutorials" [ref=e32] [cursor=pointer]:
            - /url: https://www.youtube.com/c/AutomationExercise
            - generic [ref=e33]: 
            - text: Video Tutorials
        - listitem [ref=e34]:
          - link " Contact us" [ref=e35] [cursor=pointer]:
            - /url: /contact_us
            - generic [ref=e36]: 
            - text: Contact us
  - generic [ref=e38]:
    - list [ref=e40]:
      - listitem [ref=e41]:
        - link "Home" [ref=e42] [cursor=pointer]:
          - /url: /
      - listitem [ref=e43]: Shopping Cart
    - paragraph [ref=e46]:
      - text: Cart is empty! Click
      - link "here" [ref=e47] [cursor=pointer]:
        - /url: /products
      - text: to buy products.
      - link "Shipping & Logistics" [ref=e48] [cursor=pointer]:
        - img [ref=e50]
        - text: Shipping & Logistics
    - insertion [ref=e53]:
      - generic [ref=e56]:
        - heading "These are topics related to the article that might interest you" [level=2] [ref=e58]: Discover more
        - link "Shopping cart optimization" [ref=e59] [cursor=pointer]:
          - generic "Shopping cart optimization" [ref=e60]
          - img [ref=e62]
        - link "API testing tools" [ref=e64] [cursor=pointer]:
          - generic "API testing tools" [ref=e65]
          - img [ref=e67]
        - link "Software testing courses" [ref=e69] [cursor=pointer]:
          - generic "Software testing courses" [ref=e70]
          - img [ref=e72]
  - contentinfo [ref=e74]:
    - generic [ref=e79]:
      - heading "Subscription" [level=2] [ref=e80]
      - generic [ref=e81]:
        - textbox "Your email address" [ref=e82]
        - button "" [ref=e83] [cursor=pointer]:
          - generic [ref=e84]: 
        - paragraph [ref=e85]:
          - text: Get the most recent updates from
          - text: our site and be updated your self...
    - paragraph [ref=e89]: Copyright © 2021 All rights reserved
  - text: 
  - generic:
    - insertion:
      - iframe [ref=e91]:
        
  - insertion [ref=e92]:
    - iframe [ref=e95]:
      - iframe [ref=f19e1]:
        - generic [ref=f20e1]:
          - generic [ref=f20e2]:
            - generic:
              - img [ref=f20e6] [cursor=pointer]
              - button [ref=f20e8] [cursor=pointer]:
                - img [ref=f20e9]
          - insertion [ref=f20e16]
```