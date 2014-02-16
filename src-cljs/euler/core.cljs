(ns euler.core)

(enable-console-print!)

(defn init []
  (println (euler.four/run)))

(set! (.-onload js/window) init)
