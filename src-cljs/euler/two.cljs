(ns euler.two)

(defn fib [a b] (lazy-seq (cons a (fib b (+ b a)))))

(defn run []
  (reduce + (filter even? (take-while #(< % 4000000) (fib 1 1)))))
