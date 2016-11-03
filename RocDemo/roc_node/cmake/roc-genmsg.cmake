# generated from genmsg/cmake/pkg-genmsg.cmake.em

message(STATUS "roc: 3 messages, 0 services")

set(MSG_I_FLAGS "-Iroc:/home/iliadobrusin/catkin_ws/src/roc_node/msg;-Istd_msgs:/opt/ros/indigo/share/std_msgs/cmake/../msg")

# Find all generators
find_package(gencpp REQUIRED)
find_package(genlisp REQUIRED)
find_package(genpy REQUIRED)

add_custom_target(roc_generate_messages ALL)

# verify that message/service dependencies have not changed since configure



get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg" NAME_WE)
add_custom_target(_roc_generate_messages_check_deps_${_filename}
  COMMAND ${CATKIN_ENV} ${PYTHON_EXECUTABLE} ${GENMSG_CHECK_DEPS_SCRIPT} "roc" "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg" ""
)

get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg" NAME_WE)
add_custom_target(_roc_generate_messages_check_deps_${_filename}
  COMMAND ${CATKIN_ENV} ${PYTHON_EXECUTABLE} ${GENMSG_CHECK_DEPS_SCRIPT} "roc" "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg" "roc/Motion:std_msgs/Header:roc/Movement"
)

get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg" NAME_WE)
add_custom_target(_roc_generate_messages_check_deps_${_filename}
  COMMAND ${CATKIN_ENV} ${PYTHON_EXECUTABLE} ${GENMSG_CHECK_DEPS_SCRIPT} "roc" "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg" "roc/Motion"
)

#
#  langs = gencpp;genlisp;genpy
#

### Section generating for lang: gencpp
### Generating Messages
_generate_msg_cpp(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg"
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/roc
)
_generate_msg_cpp(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg"
  "${MSG_I_FLAGS}"
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg;/opt/ros/indigo/share/std_msgs/cmake/../msg/Header.msg;/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg"
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/roc
)
_generate_msg_cpp(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg"
  "${MSG_I_FLAGS}"
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg"
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/roc
)

### Generating Services

### Generating Module File
_generate_module_cpp(roc
  ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/roc
  "${ALL_GEN_OUTPUT_FILES_cpp}"
)

add_custom_target(roc_generate_messages_cpp
  DEPENDS ${ALL_GEN_OUTPUT_FILES_cpp}
)
add_dependencies(roc_generate_messages roc_generate_messages_cpp)

# add dependencies to all check dependencies targets
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg" NAME_WE)
add_dependencies(roc_generate_messages_cpp _roc_generate_messages_check_deps_${_filename})
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg" NAME_WE)
add_dependencies(roc_generate_messages_cpp _roc_generate_messages_check_deps_${_filename})
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg" NAME_WE)
add_dependencies(roc_generate_messages_cpp _roc_generate_messages_check_deps_${_filename})

# target for backward compatibility
add_custom_target(roc_gencpp)
add_dependencies(roc_gencpp roc_generate_messages_cpp)

# register target for catkin_package(EXPORTED_TARGETS)
list(APPEND ${PROJECT_NAME}_EXPORTED_TARGETS roc_generate_messages_cpp)

### Section generating for lang: genlisp
### Generating Messages
_generate_msg_lisp(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg"
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/roc
)
_generate_msg_lisp(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg"
  "${MSG_I_FLAGS}"
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg;/opt/ros/indigo/share/std_msgs/cmake/../msg/Header.msg;/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg"
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/roc
)
_generate_msg_lisp(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg"
  "${MSG_I_FLAGS}"
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg"
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/roc
)

### Generating Services

### Generating Module File
_generate_module_lisp(roc
  ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/roc
  "${ALL_GEN_OUTPUT_FILES_lisp}"
)

add_custom_target(roc_generate_messages_lisp
  DEPENDS ${ALL_GEN_OUTPUT_FILES_lisp}
)
add_dependencies(roc_generate_messages roc_generate_messages_lisp)

# add dependencies to all check dependencies targets
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg" NAME_WE)
add_dependencies(roc_generate_messages_lisp _roc_generate_messages_check_deps_${_filename})
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg" NAME_WE)
add_dependencies(roc_generate_messages_lisp _roc_generate_messages_check_deps_${_filename})
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg" NAME_WE)
add_dependencies(roc_generate_messages_lisp _roc_generate_messages_check_deps_${_filename})

# target for backward compatibility
add_custom_target(roc_genlisp)
add_dependencies(roc_genlisp roc_generate_messages_lisp)

# register target for catkin_package(EXPORTED_TARGETS)
list(APPEND ${PROJECT_NAME}_EXPORTED_TARGETS roc_generate_messages_lisp)

### Section generating for lang: genpy
### Generating Messages
_generate_msg_py(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg"
  "${MSG_I_FLAGS}"
  ""
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc
)
_generate_msg_py(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg"
  "${MSG_I_FLAGS}"
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg;/opt/ros/indigo/share/std_msgs/cmake/../msg/Header.msg;/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg"
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc
)
_generate_msg_py(roc
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg"
  "${MSG_I_FLAGS}"
  "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg"
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc
)

### Generating Services

### Generating Module File
_generate_module_py(roc
  ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc
  "${ALL_GEN_OUTPUT_FILES_py}"
)

add_custom_target(roc_generate_messages_py
  DEPENDS ${ALL_GEN_OUTPUT_FILES_py}
)
add_dependencies(roc_generate_messages roc_generate_messages_py)

# add dependencies to all check dependencies targets
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Motion.msg" NAME_WE)
add_dependencies(roc_generate_messages_py _roc_generate_messages_check_deps_${_filename})
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Command.msg" NAME_WE)
add_dependencies(roc_generate_messages_py _roc_generate_messages_check_deps_${_filename})
get_filename_component(_filename "/home/iliadobrusin/catkin_ws/src/roc_node/msg/Movement.msg" NAME_WE)
add_dependencies(roc_generate_messages_py _roc_generate_messages_check_deps_${_filename})

# target for backward compatibility
add_custom_target(roc_genpy)
add_dependencies(roc_genpy roc_generate_messages_py)

# register target for catkin_package(EXPORTED_TARGETS)
list(APPEND ${PROJECT_NAME}_EXPORTED_TARGETS roc_generate_messages_py)



if(gencpp_INSTALL_DIR AND EXISTS ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/roc)
  # install generated code
  install(
    DIRECTORY ${CATKIN_DEVEL_PREFIX}/${gencpp_INSTALL_DIR}/roc
    DESTINATION ${gencpp_INSTALL_DIR}
  )
endif()
add_dependencies(roc_generate_messages_cpp std_msgs_generate_messages_cpp)

if(genlisp_INSTALL_DIR AND EXISTS ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/roc)
  # install generated code
  install(
    DIRECTORY ${CATKIN_DEVEL_PREFIX}/${genlisp_INSTALL_DIR}/roc
    DESTINATION ${genlisp_INSTALL_DIR}
  )
endif()
add_dependencies(roc_generate_messages_lisp std_msgs_generate_messages_lisp)

if(genpy_INSTALL_DIR AND EXISTS ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc)
  install(CODE "execute_process(COMMAND \"/usr/bin/python\" -m compileall \"${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc\")")
  # install generated code
  install(
    DIRECTORY ${CATKIN_DEVEL_PREFIX}/${genpy_INSTALL_DIR}/roc
    DESTINATION ${genpy_INSTALL_DIR}
  )
endif()
add_dependencies(roc_generate_messages_py std_msgs_generate_messages_py)
