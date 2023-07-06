package com.poc.demows.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnvController {

    @GetMapping("/env/{index}")
    public ResponseEntity<String> getAuthHeader(@PathVariable int index){
        List<String> list = List.of("Bearer eyJraWQiOiJLZXlJZDEiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJVbmlmaWVkIFBsYXRmb3JtIEh1YiIsImF1ZCI6IlVuaWZpZWQgUGxhdGZvcm0gSHViIEFQSSBVc2VyIiwiZXhwIjoxNjg4OTM3Nzc5LCJqdGkiOiJQcTR4NGRGem1tOVhfR0dIMHVsNjd3IiwiaWF0IjoxNjg4Njc4NTc5LCJ1aWQiOjc5LCJ1b3JnaWQiOiIxNTAwMCIsInVpbnRlcm5hbCI6ZmFsc2UsInRhY2Nlc3MiOiI2Y2YyNzcyNzA5NmIzMGY5ZjkwMGY5ZTBkZDk3NmFkOTUzYzE3ZTMxYTM3NjRhMmVjYzU1NDQ0NTgxYWU5NjVkIiwidHJlZnJlc2giOiJmMzMyZTQ0N2FjNjBmMDU2MDc5ZTUyYWM5ZTEyOTVmOGU4MzQ0MzU0OTczYjAzMWQzYjJiMGU1N2YyNGJmOGFmIiwidGV4cGlyYXRpb24iOjcyMDAsInRjcmVhdGVkIjoxNjg4Njc4NTc5LCJzdWIiOiJjZ29tZXpAaW5tYXJrZXQuY29tIn0.Q77PeEONi23R90iG4RKONdpefYLlf8tidw-es52Jkr24lbjFbsvAyjTAtMUNN62YTrk1HKhfO3gbTo90s4so0FdQS7IsQszghXu1OesgvwI_5oEjlza0yjPjF0u2yH4BqOkRIvzWqo_4Mme4cXId-7oYiXnbqyhkMB409ejR2J8awAzT0Sdm0ez1RlUTP0V0vqxSmm_HhHtBN9mwU7FlJFpF7iugnkaDakOclvu_GxEoCws1e7_QBShKK20xoJretH0IchcukPfjTP7Urm3O28dA77Qd5EzLC7grKelObH-p5Yma2N_38IGA9sUYsMCBgPT9kPereDoUCptsQGBCwg",
                "Bearer eyJraWQiOiJLZXlJZDEiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJVbmlmaWVkIFBsYXRmb3JtIEh1YiIsImF1ZCI6IlVuaWZpZWQgUGxhdGZvcm0gSHViIEFQSSBVc2VyIiwiZXhwIjoxNjg4OTM3ODIxLCJqdGkiOiJqckt1ellsbHIwdHdoZzhCUklOdC1BIiwiaWF0IjoxNjg4Njc4NjIxLCJ1aWQiOjI3MSwidW9yZ2lkIjoiMTUwMDkiLCJ1aW50ZXJuYWwiOnRydWUsInRhY2Nlc3MiOiJmOTBjZWExZWE3NzkwZjdjZTZlOGFjNDExYzRhOTk5MTI0M2ZlMTYwODA2NDBiNDg1OWJhMWEyZDRmMzIyMmU5IiwidHJlZnJlc2giOiIwYjMxMGZjZDIwZDdkM2IxYWRjNmM2MjgwMmQxMjdhZjQwZWM2ZmEwOTExODQxMjkzMTc2M2M1NzEwNTBiZjk2IiwidGV4cGlyYXRpb24iOjcyMDAsInRjcmVhdGVkIjoxNjg4Njc4NjIxLCJzdWIiOiJyZGhhcm1hdHRpQGlubWFya2V0LmNvbSJ9.Gt0EMDFHNDBT3P5vjAV7IyoOH6sYt0T4KkdVFEljWbMzy7F0v6tePc8Q7TPlLoI3x6O6ktpnq3wCTcb7LBK2ohehryqxQHRZJMu8TesG7jZrsLSlmVkiHyMgPURzLJDz-pnKiL13m64BE26xuLRsBvh7vKqejVGrWGQCogpwKwOc6s5ijO6YogOPWAhBZfcoFGq8iJmgJ4mD5NTEF2UDrOQw64_z_U7OKRBE4yAKnJdTMXpfu0t0u8PQbqmyWGo72DhfqcyL96yQQUzjf1DZDdZow2JELSdkMGYDXW8FUtsnkeOHwkt_E5w0B5YV3nCoJ-cQCT0NUor5CduhzJ4F9Q");

        return ResponseEntity.ok(list.get(index));
    }
}